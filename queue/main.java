package queue;

/**
 * main
 */
public class main {
    public static void main(String[] args) {
        queue q = new queue(10);
        queue q2 = q;
        q2.enqueue(5);
        q2.enqueue(10);
        q2.enqueue(15);
        q2.enqueue(20);
        System.out.println("-----------------Queue O/P-----------------");
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        // System.out.println(q.dequeue());
        q2.showAll();
        System.out.println("-----------------Queue Realtime example O/P-----------------");
        person person1 = new person("Pravin", "4041");
        person person2 = new person("Ravi", "4042");

        personQueue pq = new personQueue();
        pq.enqueue(person1);
        pq.enqueue(person2);
        System.out.println("-----------------Queue O/P-----------------");

        pq.showAll();
    }
}