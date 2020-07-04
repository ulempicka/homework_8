package trainingCompanyPartTwo;

public class Group {
    private Teacher teacher;
    private int classesCount;
    private int limitOfStudents;
    private String course;

    public Group(Teacher teacher, int classesCount, int limitOfStudents, String course) {
        this.teacher = teacher;
        this.classesCount = classesCount;
        this.limitOfStudents = limitOfStudents;
        this.course = course;
    }

    public void showGroup(){
        teacher.show();
        System.out.println("liczba zajec: " + classesCount + " limit  uczestnikow: " + limitOfStudents + " nazwa kursu: " + course);
    }
}
