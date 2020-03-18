package queue;

/**
 * queue
 */
public class personQueue {

    private person q[];
    private int rear;
    private int front;
    private int totel;
    private int size;

    public personQueue() {
        size = 50;
        rear = 0;
        front = 0;
        totel = 0;
        q = new person[size];
    }

    public personQueue(int size) {
        this.size = size;
        rear = 0;
        front = 0;
        totel = 0;
        q = new person[this.size];
    }

    public boolean enqueue(person item) {
        if (isFull()) {
            return false;
        } else {
            totel++;
            q[rear] = item;
            // rear++;
            rear = (rear + 1) % size;
            return true;
        }
    }

    public person dequeue() {
        person item = q[front];
        totel--;
        // front++
        front = (front + 1) % size;
        return item;
    }

    public boolean isFull() {
        if (size == totel) {
            return true;
        } else {
            return false;
        }
    }

    public void showAll() {
        int f = front;
        if (totel != 0) {
            for (int i = 0; i < totel; i++) {
                System.out.println("" + q[f].toString());
                f = (f + 1) % size;
            }
        }
    }

}