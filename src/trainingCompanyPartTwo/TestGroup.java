package trainingCompanyPartTwo;

public class TestGroup {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Stanislaw", "Rumin", 6812343, "IT", 15);
        Student student1 = new Student("Anna", "Kowal", 881255,2500, true);
        Grades grades1 = new Grades(teacher1,student1,10,12, "Excel", 3.5);
        Grades grades2 = new Grades(teacher1,student1,7,10, "SQL", 4);

        grades1.showGroup();
        grades2.showGroup();

    }
}
