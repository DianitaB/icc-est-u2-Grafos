import controllers.Graph;
import models.Node;

public class App {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node5 = graph.addNode(5);
        Node node8 = graph.addNode(8);
        Node node0 = graph.addNode(0);
        Node node1 = graph.addNode(1);
        Node node9 = graph.addNode(9);
        Node node2 = graph.addNode(2);
        Node node3 = graph.addNode(3);
        Node node4 = graph.addNode(4);
        Node node7 = graph.addNode(7);

        node5.addNeighbor(node0);

        node8.addNeighbor(node1);
        node8.addNeighbor(node7);

        node0.addNeighbor(node5);
        node0.addNeighbor(node1);
        node0.addNeighbor(node3);

        node1.addNeighbor(node8);
        node1.addNeighbor(node0);
        node1.addNeighbor(node2);
        node1.addNeighbor(node4);

        node9.addNeighbor(node3);

        node2.addNeighbor(node1);
        node2.addNeighbor(node3);

        node3.addNeighbor(node0);
        node3.addNeighbor(node9);
        node3.addNeighbor(node2);
        node3.addNeighbor(node4);
        node3.addNeighbor(node7);

        node4.addNeighbor(node1);
        node4.addNeighbor(node3);

        node7.addNeighbor(node8);
        node7.addNeighbor(node3);

        System.out.println(" DIANA BORJA");
        graph.printGraph();
    }
}