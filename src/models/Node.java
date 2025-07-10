package models;
import java.util.*;

public class Node {
    public int value;
    List<Node> neighbors;

    public Node(int value) {
        this.value = value;
        this.neighbors = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void addNeighbor(Node neigborhod) {
        neighbors.add(neigborhod);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + value;
        result = prime * result + ((neighbors == null) ? 0 : neighbors.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (value != other.value)
            return false;
        if (neighbors == null) {
            if (other.neighbors != null)
                return false;
        } else if (!neighbors.equals(other.neighbors))
            return false;
        return true;
    }
    
}