package stack;

public class personStack {

    private person stack[];
    private int top;
    private int size;

    public personStack() {
        top = -1;
        size = 50;
        stack = new person[50];

    }

    public personStack(int size) {
        top = -1;
        this.size = size;
        stack = new person[this.size];
    }

    public boolean push(person item) {
        if (!isFull()) {
            top++;
            stack[top] = item;
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        return (top == stack.length - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public person pop() {
        return stack[top--];
    }

}