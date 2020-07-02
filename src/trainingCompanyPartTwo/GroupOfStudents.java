package trainingCompanyPartTwo;

public class GroupOfStudents {
    private Teacher teacher;
    private Student[] student;
    private int classesCount;
    private int limitOfStudents;
    private String course;

    public GroupOfStudents(Teacher teacher, Student[] student, int classesCount, int limitOfStudents,String course) {
        this.teacher = teacher;
        this.student = student;
        this.classesCount = classesCount;
        this.limitOfStudents = limitOfStudents;
        this.course = course;
    }

    public void showGroup(){
        teacher.show();
        for (int i = 0; i < student.length; i++) {
            student[i].show();
        }
        System.out.println("liczba zajec: " + classesCount + " limit  uczestnikow: " + limitOfStudents + " nazwa kursu: " + course);
    }
}
