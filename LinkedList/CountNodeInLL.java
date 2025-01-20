package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CountNodeInLL {

    static int abc(Node head) {
        if (head == null) return 0;

        Node curr = head;
        int result = 1; // Start counting from the head node

        while (curr.next != head) { // Traverse until we reach the head again
            result++;
            curr = curr.next;
        }

        return result;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head; // Making it circular

        // Call static method without instantiating the class
        System.out.println(CountNodeInLL.abc(head)); // Output: 5
    }
}
