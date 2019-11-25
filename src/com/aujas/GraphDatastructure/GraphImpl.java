package com.aujas.GraphDatastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphImpl {

   static class Graph{
        int V;
        LinkedList<Integer> adjListArray[];

        public Graph(int v) {
            this.V = v;
            this.adjListArray = new LinkedList[V];
        for (int i = 0;i<V; i++){
            adjListArray[i] = new LinkedList<>();
            }
        }
    }

    public static void addEdge(Graph graph, int source, int dest){
        graph.adjListArray[source].add(dest);
        graph.adjListArray[dest].add(source);
    }

    public static void printgraph(Graph graph){

       for (int i = 0;i<graph.V;i++){
           System.out.println("#######");
           Iterator iterator = graph.adjListArray[i].iterator();
           while (iterator.hasNext()){
               System.out.print(iterator.next()+ " ");
           }
           System.out.println();
       }
    }

    public static void DFS(){

    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        printgraph(graph);

    }
}
