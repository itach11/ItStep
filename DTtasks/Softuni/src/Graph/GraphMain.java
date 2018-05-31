package Graph;

import java.io.*;

public class GraphMain {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        String regexSplit = ",";
        Graph graph = new Graph(8);



        //Filling the graph From csv file
        graph.fillTheGraph(fileName,regexSplit);


        //Output
        graph.print();
        System.out.println("----------");
        graph.printDfs(0);
        System.out.println("----------");
        graph.printBfs(0);


    }
}
