class MyLinkedList {

    // Node
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // First node of the linked list
    Node head;

    // Constructor
    public MyLinkedList() {
        head = null;
    }

    // Get value at index
    public int get(int index) {

        Node temp = head;

        for (int i = 0; i < index; i++) {

            if (temp == null) {
                return -1;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return -1;
        }

        return temp.data;
    }

    // Add node at beginning
    public void addAtHead(int val) {

        Node newNode = new Node(val);

        newNode.next = head;

        head = newNode;
    }

    // Add node at end
    public void addAtTail(int val) {

        Node newNode = new Node(val);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        // Find last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Connect last node to new node
        temp.next = newNode;
    }

    // Add node at given index
    public void addAtIndex(int index, int val) {

        // Add at beginning
        if (index == 0) {
            addAtHead(val);
            return;
        }

        Node temp = head;

        // Move to node before the required index
        for (int i = 0; i < index - 1; i++) {

            if (temp == null) {
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete node at given index
    public void deleteAtIndex(int index) {

        // Empty list
        if (head == null) {
            return;
        }

        // Delete first node
        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;

        // Move to node before the one we want to delete
        for (int i = 0; i < index - 1; i++) {

            if (temp == null || temp.next == null) {
                return;
            }

            temp = temp.next;
        }

        // Delete the node
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */