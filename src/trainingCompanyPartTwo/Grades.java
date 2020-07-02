package trainingCompanyPartTwo;

import java.util.Arrays;

public class Grades {
    private double[] grades;
    GroupOfStudents[] group;

    public Grades(double[] grades, GroupOfStudents[] group) {       //grades[][]???
        this.grades = grades;
        this.group = group;
    }

    void showGrades(){
        for (int i = 0; i < group.length; i++) {
            System.out.println("+++++++++++++++++++++++++++++++++++++++KURS+++++++++++++++++++++++++++++++++++++++++++++++++++");
            group[i].showGroup();
            System.out.println("Ocena z kursu: " + grades[i]);
        }
    }
}
