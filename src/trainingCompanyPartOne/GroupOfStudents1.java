package trainingCompanyPartOne;

public class GroupOfStudents1 {
    private Teacher teacher;
    private Student[] student;
    private int classesCount;
    private int limitOfStudents;

    public GroupOfStudents1(Teacher teacher, Student[] student, int classesCount, int limitOfStudents) {
        this.teacher = teacher;
        this.student = student;
        this.classesCount = classesCount;
        this.limitOfStudents = limitOfStudents;
    }

    public void showGroup(){
        teacher.show();
        for (int i = 0; i < student.length; i++) {
            student[i].show();
        }
        System.out.println("liczba zajec: " + classesCount + " limit  uczestnikow: " + limitOfStudents);
    }
}
