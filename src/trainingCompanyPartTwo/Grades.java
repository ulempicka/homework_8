package trainingCompanyPartTwo;

public class Grades extends GroupOfStudents2 {
    private double grade;

    public Grades(Teacher teacher, Student student, int classesCount, int limitOfStudents, String course, double grade) {
        super(teacher,student,classesCount,limitOfStudents,course);
        this.grade = grade;
    }

    @Override
    public void showGroup(){
        super.showGroup();
        System.out.println("ocena: " + grade);
    }

}
