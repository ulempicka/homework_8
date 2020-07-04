package trainingCompanyPartTwo;

public class TestGrades {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Stanislaw", "Rumin", 6812343, "IT", 15);
        Student student1 = new Student("Anna", "Kowal", 881255,2500, true);
        Group group1 = new Group(teacher1, 10, 12, "Excel");
        Group group2 = new Group(teacher1,7,10, "SQL");
        Grades grades1 = new Grades(student1, group1, 3.5);
        Grades grades2 = new Grades(student1, group2, 4.5);
        grades1.showGrades();
        grades2.showGrades();
    }
}
