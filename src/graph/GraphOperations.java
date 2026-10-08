package graph;

import java.util.*;

public class GraphOperations {

private Map<String, List<String>> graph;

public GraphOperations() {
graph = new HashMap<>();
}

public void addVertex(String vertex) {
graph.putIfAbsent(vertex, new ArrayList<>());
System.out.println("Vertex added: " + vertex);
}

public void addEdge(String source, String destination) {

graph.putIfAbsent(source, new ArrayList<>());
graph.putIfAbsent(destination, new ArrayList<>());

graph.get(source).add(destination);
graph.get(destination).add(source);

System.out.println("Edge added between "
+ source + " and " + destination);
}

public void displayGraph() {

for (String vertex : graph.keySet()) {

System.out.print(vertex + " -> ");

for (String neighbor : graph.get(vertex)) {
System.out.print(neighbor + " ");
}

System.out.println();
}
}

public void bfs(String start) {

Set<String> visited = new HashSet<>();

Queue<String> queue = new LinkedList<>();

visited.add(start);
queue.offer(start);

System.out.print("BFS: ");

while (!queue.isEmpty()) {

String vertex = queue.poll();

System.out.print(vertex + " ");

for (String neighbor : graph.get(vertex)) {

if (!visited.contains(neighbor)) {

visited.add(neighbor);
queue.offer(neighbor);
}
}
}

System.out.println();
}

public void dfs(String start) {

Set<String> visited = new HashSet<>();

System.out.print("DFS: ");

dfsHelper(start, visited);

System.out.println();
}

private void dfsHelper(String vertex,
Set<String> visited) {

visited.add(vertex);

System.out.print(vertex + " ");

for (String neighbor : graph.get(vertex)) {

if (!visited.contains(neighbor)) {
dfsHelper(neighbor, visited);
}
}
}
}
