package controllers;

import java.util.HashSet;
import java.util.Set;

import models.Node;

public class Graph {
    private Set<Node> nodes;

    public Graph(){
        nodes = new HashSet<>();
    }

    public Node addNode(int value){
        Node node = new Node(value);
        nodes.add(node);
        return node;
    }

    public void addEdge(Node src, Node dest){
        src.addNeighbor(dest);
    }

    public void printGraph(){
         for (Node node : nodes) {
        System.out.print("Nodo " + node.getValue() + ": -> ");
        for (Node neighbor : node.getNeighbors()) {
            System.out.print(neighbor.getValue() + " -> ");
        }
        System.out.println(); 
    }


    }

    public void getDFS(Node startNode){

    }

    public void getDFSUtil(Node node, boolean[]visited){

    }

    public void getBFS(Node startNode){

    }
    

}