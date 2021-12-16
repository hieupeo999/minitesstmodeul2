public class Student extends Human{
    private double avg;

    public Student() {
    }

    public Student(String name, int age, int id) {
        super(name, age, id);
    }

    public Student(double avg) {
        this.avg = avg;
    }

    public Student(String name, int age, int id, double avg) {
        super(name, age, id);
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "avg=" + avg +
                '}';
    }
}
