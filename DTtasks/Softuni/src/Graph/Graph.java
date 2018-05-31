package Graph;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    private final List<List<Integer>> nodes;

    public Graph(int verticesCount) {
        nodes = new ArrayList<>();
        for (int i = 0; i < verticesCount; i++) {
            nodes.add(new ArrayList<>());
        }
    }

    private void addEdge(int x, int y) {
        addDirectedEdge(x, y);
        addDirectedEdge(y, x);
    }
    private void addDirectedEdge(int from, int to) {
        List<Integer> neighbours = nodes.get(from);
        neighbours.add(to);
    }

    public void printBfs(int vertex) {

    }


    public void printDfs(int vertex) {

        Set<Integer> used = new HashSet<>();
        used.add(vertex);
        System.out.println("DFS! \n------------");

        dfs(vertex, used);
    }


    private void bfs (int vertex, Set<Integer> used){
        System.out.println(vertex);

    }
    private void dfs(int vertex, Set<Integer> used) {
        System.out.println(vertex);
        for (Integer neighbour : nodes.get(vertex)) {
            if (!used.contains(neighbour)) {
                used.add(neighbour);
                dfs(neighbour, used);
            }
        }
    }
    public void print() {
        final int[] index = { 0 };
        for (List<Integer> neighbours : nodes) {
            System.out.println(MessageFormat.format("--- {0} ----", index[0]));

            neighbours.forEach(System.out::println);
            index[0]++;
        }
    }
        public void fillTheGraph(String fileName,String regex) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while((line=br.readLine())!=null){
                String arr [] = line.split(regex);
                for (int i = 0; i <(arr.length)/2; i++) {
                 int x = Integer.parseInt(arr[i+i]);
                 int y = Integer.parseInt(arr[i+1+i]);
                    addEdge(x,y);

                }

            }

        }


}
