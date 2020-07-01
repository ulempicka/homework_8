package trainingCompanyPartTwo;

public class Grades extends Course {
    private double grade;

    public Grades(Teacher teacher, Student student, int classesCount, int limitOfStudents, String course, double grade) {
        super(teacher,student,classesCount,limitOfStudents,course);
        this.grade = grade;
    }

    @Override
    public void showCourse(){
        super.showCourse();
        System.out.println("ocena: " + grade);
    }

}
