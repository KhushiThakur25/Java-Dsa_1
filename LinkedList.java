class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head = null;

    public void insertionAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertionAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    public void insertionAtAnyWhere(int data, int pos) {
        Node newNode = new Node(data);
        Node cur = head;
        Node prev = null;
        while (cur != null && pos > 1) {
            prev = cur;
            cur = cur.next;
            pos--;
        }
        if (pos == 1) {
            prev.next = newNode;
            newNode.next = cur;
        }
    }

    public void deletionAtStart() {
        if (head == null) {
            System.out.println("There is no node to delete");
            return;
        }
        head = head.next;
    }

    public void deletionAtEnd() {
        if (head.next == null) {
            head = null;
            return;
        }
        Node cur = head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        cur.next = null;
    }

    public void deletionAtAnyWhere(int pos) {

        Node cur = head;
        Node prev = null;
        while (cur != null && pos > 1) {
            prev = cur;
            cur = cur.next;
            pos--;
        }
        if (pos == 1) {
            prev.next = cur.next;

        }
    }

    public void show() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + "-->");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        for (int i = 1; i < 9; i++) {
            obj.insertionAtEnd(i);
        }
        obj.show();
        obj.insertionAtStart(81);
        obj.show();
        obj.insertionAtAnyWhere(100, 4);
        obj.show();
    }
}
