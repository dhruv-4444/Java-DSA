public class SingleToCircular {

    // Make the linked list circular
    public static Node circular(Node head) {
        if (head == null)
            return null;

        Node temp = head;

        // Traverse to the end of the list
        while (head.next != null) {
            head = head.next;
        }
        // Connect the last node to the first node
        head.next = temp;

        return temp; // Return the head of the circular list
    }

    // Method to print the circular linked list
    static void printList(Node head) {
        if (head == null)
            return;

        Node curr = head;

        // Print the nodes until we encounter the head again
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }

    public static void main(String[] args) {

        // Create a hard coded list: 10->12->14->16
        Node head = new Node(10);
        head.next = new Node(12);
        head.next.next = new Node(14);
        head.next.next.next = new Node(16);

        // Convert the list to a circular linked list
        head = circular(head);

        // Print the circular linked list
        printList(head);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
