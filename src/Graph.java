import java.util.ArrayList;
import java.util.HashMap;

public class Graph <T, V> {

    public HashMap<T, ArrayList<V>> graph;

    public Graph() {
        graph = new HashMap<>();
    }

    public Graph(T ... keys) {
        graph = new HashMap<>();
        for (T key : keys) {
            add(key);
        }
    }

    public void add(T key, V...values) {
        if (!graph.containsKey(key)) {
            add(key);
        }
        for (V value : values) {
            graph.get(key).add(value);
        }
    }

    public void add(T key) {
        if (!graph.containsKey(key)) {
            ArrayList<V> list = new ArrayList<>();
            graph.put(key, list);
        }
    }
}
