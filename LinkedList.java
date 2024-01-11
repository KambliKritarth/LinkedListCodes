public class LinkedList {

    private Node head; // Reference to the first node
    private Node tail; // Reference to the last node
    private int size = 0; // Number of nodes in the list

    // Inner class representing a node in the list
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Method to add a node to the end of the list
    public void add(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Method to print the contents of the list
    public void printList()
    {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Additional methods you might implement:
    // - get(index): Get the data at a specific index
    // - remove(index): Remove a node at a specific index
    // - insert(index, data): Insert a node at a specific index
    // - isEmpty(): Check if the list is empty
    // - size(): Get the number of nodes in the list
    // - getFirst(): Get the first node's data
    // - getLast(): Get the last node's data
    // - ... and more
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        int llData[] = {3,2,5,6,-1};
        for(int i = 0; i<llData.length; i++)
            ll.add(llData[i]);
        ll.printList();
    }
}