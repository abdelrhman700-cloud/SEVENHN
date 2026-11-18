public class PersonTest {
public static void main(String[] args) {

    Person p1 = new Person();
    p1.name = "Ali";
    p1.age = 20;
    p1.city = "Kigali";
    p1.height = 1.75;
    Person.totalPeople++;

    Person p2 = new Person();
    p2.name = "Sara";
    p2.age = 22;
    p2.city = "Musanze";
    p2.height = 1.62;
    Person.totalPeople++;

    Person p3 = new Person();
    p3.name = "Omar";
    p3.age = 25;
    p3.city = "Rubavu";
    p3.height = 1.80;
    Person.totalPeople++;

    System.out.println("=== Initial 3 People ===");
    p1.displayInfo();
    p2.displayInfo();
    p3.displayInfo();

    System.out.println("=== Updating Heights ===");
    p1.setHeight(1.78);
    p2.setHeight(1.65);
    System.out.println();

    System.out.println("=== Birthday Celebration ===");
    p3.haveBirthday();
    System.out.println();

    System.out.println("=== Loop Created People ===");
    for (int i = 1; i <= 5; i++) {
        Person temp = new Person();
        temp.name = "Person" + i;
        temp.age = 18 + i;
        temp.city = "City" + i;
        temp.height = 1.60 + (i * 0.03);
        
        Person.totalPeople++;
        temp.displayInfo();
    }

    System.out.println("=== Final Count ===");
    Person.showTotalPeople();
}
}
