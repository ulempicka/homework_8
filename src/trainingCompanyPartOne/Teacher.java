package trainingCompanyPartOne;

public class Teacher extends Person{
    private String area;
    private int experience;

    public Teacher(String firstName, String lastName, int peselId, String area, int experience) {
        super(firstName, lastName, peselId);
        this.area = area;
        this.experience = experience;
    }

    @Override
    public void show() {
        super.show();
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "area='" + area + '\'' +
                ", experience=" + experience +
                '}';
    }
}
