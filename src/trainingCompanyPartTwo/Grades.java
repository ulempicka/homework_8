package trainingCompanyPartTwo;

public class Grades {
    Student student;
    Group group;
    private double grade;

    public Grades(Student student, Group group, double grade) {
        this.student = student;
        this.group = group;
        this.grade = grade;
    }

    void showGrades() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++KURS+++++++++++++++++++++++++++++++++++++++++++++++++++");
        group.showGroup();
        student.show();
        System.out.println("Ocena z kursu: " + grade);
    }
}
