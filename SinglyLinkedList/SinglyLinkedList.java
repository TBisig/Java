public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Object getHead() {
        return this.head;
    }

    public void add(int i) {
        Node newNode = new Node(i);
        Node pointer = head;
        if(head == null) {
            head = newNode;
        } else {
            while(pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(newNode);
        }
    }

    public int remove() {
        Node pointer = head;
        Node previous = pointer;
        if(head == null) {
            return -1;
        } else {
            while(pointer.getNext() != null) {
                previous = pointer;
                pointer = pointer.getNext();
            }
            previous.setNext(null);
            return pointer.getValue();
        }
    }

    public void printValues() {
        Node pointer = head;
        while(pointer.getNext() != null) {
            System.out.println(pointer.getValue());
            pointer = pointer.getNext();
        }
        System.out.println(pointer.getValue());
    }
}