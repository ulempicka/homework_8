package trainingCompanyPartOne;

public class GroupOfStudents {
    private Teacher teacher;
    private Student[] students;
    private int classesCount;
    private int limitOfStudents;
    private String course;

    public GroupOfStudents(Teacher teacher, Student[] students, int classesCount, int limitOfStudents, String course) {
        this.teacher = teacher;
        this.students = students;
        this.classesCount = classesCount;
        this.limitOfStudents = limitOfStudents;
        this.course = course;
    }

    public void showGroup(){
        teacher.show();
        for (Student student : students) {
            student.show();
        }
        System.out.println("liczba zajec: " + classesCount + " limit  uczestnikow: " + limitOfStudents + " kurs: " + course);
    }
}
