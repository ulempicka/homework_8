package trainingCompanyPartTwo;

public class Grades {
    private double grade;
    Group group;
    Student student;

    public Grades(double grade, Group group, Student student) {
        this.grade = grade;
        this.group = group;
        this.student = student;
    }

    void showGrades() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++KURS+++++++++++++++++++++++++++++++++++++++++++++++++++");
        group.showGroup();
        student.show();
        System.out.println("Ocena z kursu: " + grade);
    }
}
