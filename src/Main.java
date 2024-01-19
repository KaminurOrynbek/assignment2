import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String [] args){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(
                new Employee("Askar", "Khaimuldin", "Senior Lecturer", 3000000.00F)
        );
        persons.add(
                new Employee("Nursultan", "Khaimuldin", "Teacher", 500000.00F)
        );
        persons.add(
                new Student("Kaminur", "Orynbek", 4.00F)
        );
        persons.add(
                new Student("Alima", "Kassenkazy", 4.00F)
        );

        Collections.sort(persons);
        PrintData(persons);
    }

    private static void PrintData(Iterable<Person> persons) {
        for (Person p : persons) {
            String message = p.toString() + " earns " + Double.toString(p.getPaymentAmount()) + " tenge";
            System.out.println(message);
        }
    }

}
