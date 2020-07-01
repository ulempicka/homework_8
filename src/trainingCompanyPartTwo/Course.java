package trainingCompanyPartTwo;

public class Course {
    private Teacher teacher;
    private Student student;
    private int classesCount;
    private int limitOfStudents;
    private String course;

    public Course(Teacher teacher, Student student, int classesCount, int limitOfStudents, String course) {
        this.teacher = teacher;
        this.student = student;
        this.classesCount = classesCount;
        this.limitOfStudents = limitOfStudents;
        this.course = course;
    }

    public void showCourse(){
        teacher.show();
        student.show();
        System.out.println("liczba zajec: " + classesCount + " limit  uczestnikow: " + limitOfStudents);
    }
}
