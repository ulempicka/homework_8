package trainingCompanyPartOne;

public class Student extends Person{
    private int fee;
    private boolean credit;
    private static int studentsCount;

    public Student(String firstName, String lastName, int peselId, int fee, boolean credit) {
        super(firstName, lastName, peselId);
        this.fee = fee;
        this.credit = credit;
        studentsCount++;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "fee=" + fee +
                ", credit=" + credit +
                '}';
    }
}
