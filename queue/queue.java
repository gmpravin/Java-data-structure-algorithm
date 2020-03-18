package queue;

/**
 * queue
 */
public class queue {

    private int q[];
    private int rear;
    private int front;
    private int totel;
    private int size;

    public queue() {
        size = 50;
        rear = 0;
        front = 0;
        totel = 0;
        q = new int[size];
    }

    public queue(int size) {
        this.size = size;
        rear = 0;
        front = 0;
        totel = 0;
        q = new int[this.size];
    }

    public boolean enqueue(int item) {
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

    public int dequeue() {
        int item = q[front];
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
                System.out.println("" + q[f]);
                f = (f + 1) % size;
            }
        }
    }

}