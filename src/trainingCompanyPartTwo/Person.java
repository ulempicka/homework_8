package trainingCompanyPartTwo;

public class Person {
    private String firstName;
    private String lastName;
    private int peselId;

    public Person(String firstName, String lastName, int peselId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselId = peselId;
    }

    void show(){
        System.out.println("imie: " + firstName + ", nazwisko: " + lastName + ", pesel: " + peselId);
    }
}
