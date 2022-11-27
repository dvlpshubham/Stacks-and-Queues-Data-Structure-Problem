package datastructure;

public class Queue {
    LinkedList linkedList = new LinkedList();

    public void enque(Object data) {
        linkedList.addLast(data);
        displayQueue();
    }

    public void displayQueue() {
        linkedList.display();
    }
}
