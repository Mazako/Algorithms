import java.util.*;

public class graphTest {
    public static void main(String[] args) {
        Graph<String, String> person = new Graph<>();
        person.add("ty","alicja","bartek","cecylia");
        person.add("bartek","janusz","patrycja","ty");
        person.add("alicja","patrycja", "ty");
        person.add("cecylia","tamarm","jarek", "ty");
        person.add("janusz","bartek");
        person.add("patrycja","bartek","alicja");
        person.add("tamarm","cecylia");
        person.add("jarek","cecylia","patryk");
        person.add("patryk","jarek");

        BFS(person ,"janusz","patryk");
    }

    private static void BFS(Graph<String, String> person, String start, String end) {
        Queue<String> queue = new LinkedList<>();
        person.graph.get(start).forEach(x->queue.add(x));
        ArrayList<String> searched = new ArrayList<>();
        searched.add(start);
        HashMap<String,String> dependencyMap = initializeDependencies(person.graph.keySet());
        String neighbour = start;
        while(!queue.isEmpty()) {
            String p = queue.poll();
            if (!searched.contains(p)) {
                person.graph.get(p).forEach(x -> queue.add(x));
                searched.add(p);
                if (person.graph.get(neighbour).contains(p))
                    dependencyMap.put(p,neighbour);
                else {
                    for (String value : dependencyMap.keySet()) {
                        if (person.graph.get(p).contains(value) && dependencyMap.get(value) != null) {
                            dependencyMap.put(p,value);
                        }
                    }
                }
            }
        }
        printroute(dependencyMap,start,end);
        System.out.println(dependencyMap);
    }

    private static void printroute(HashMap<String, String> dependencyMap, String start, String end) {
        String point = end;
        while (point != null) {
            System.out.println(point);
            point = dependencyMap.get(point);
        }
    }

    private static HashMap<String, String> initializeDependencies(Set<String> keySet) {
        HashMap<String, String> map = new HashMap<>();
        keySet.forEach(x -> map.put(x, null));
        return map;
    }


}
