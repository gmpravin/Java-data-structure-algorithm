package queue;

public class person {
    private String name;
    private String rollno;

    public person(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String toString() {
        return "Name: " + this.name + " Roll no: " + this.rollno;
    }
}