public class Student {

    // instance variables
    private String name;
    private final int idNumber;

    // static variable
    private static int nextID = 1;

    // constructor
    public Student(String name, final int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // second constructor using nextID
    public Student(String name) {
        this.name = name;
        this.idNumber = nextID;
        nextID += 1; // increase by 1 for next student
    }

    // student name changer method
    public void setName(String newName) {
        this.name = newName;
    }

    // studentID comparison method
    public boolean precedesById(Student other) {
        return this.idNumber < other.idNumber;
    }

    // for getting or getters
    public String getName() {
        return name;
    }
    public int getIdNumber() {
        return idNumber;
    }

    // to-string method
    public String toString() {
        return "Name: " + name + ", IdNumber: " + idNumber;
    }

    // main method for testing
    public static void main(String[] args) {
        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);

        System.out.println(bob1.precedesById(bob2));
        System.out.println(bob2.precedesById(bob1));
    }
}
