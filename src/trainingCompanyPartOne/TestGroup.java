package trainingCompanyPartOne;

public class TestGroup {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Stanislaw", "Rumin", 6812343, "IT", "Excel", 15);
        Student student1 = new Student("Anna", "Kowal", 881255,2500, true);
        Student student2 = new Student("Piotr", "Nowak", 90321233, 2000, false);
        Student[] students = {student1, student2};
        GroupOfStudents groupOfStudents = new GroupOfStudents(teacher,students,10,12);

        groupOfStudents.showGroup();

    }
}
