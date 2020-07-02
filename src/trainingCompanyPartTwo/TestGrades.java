package trainingCompanyPartTwo;

public class TestGrades {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Stanislaw", "Rumin", 6812343, "IT", 15);
        Student student1 = new Student("Anna", "Kowal", 881255,2500, true);
        Student[] students = {student1};
        GroupOfStudents group1 = new GroupOfStudents(teacher1, students, 10, 12, "Excel");
        GroupOfStudents group2 = new GroupOfStudents(teacher1,students,7,10, "SQL");

        GroupOfStudents[] groups = {group1,group2};
        double[] gradesPerCourse = {3.5, 4};
        Grades gradesList = new Grades(gradesPerCourse,groups);

        gradesList.showGrades();
    }
}
