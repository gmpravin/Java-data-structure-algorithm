package stack;

public class stack {
    public static void main(String[] args) {
        IntStack s = new IntStack(3);
        if (!s.isFull()) {
            s.push(5);
            s.push(7);
            s.push(9);
        }
        System.out.println("-----------------Int Stack O/P-----------------");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());

        person person1 = new person("Pravin", "4041");
        person person2 = new person("Ravi", "4042");
        personStack stack = new personStack();

        if (!stack.isFull()) {
            stack.push(person1);
            stack.push(person2);

        }

        String x = "-----------------Stack Realtime example O/P-----------------";
        System.out.println(x);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

    }
}
