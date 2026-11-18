public class Person {

    String name;
    int age;
    String city;
    double height;

    static int totalPeople = 0;

    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Height: " + height);

    }

    public void setHeight(double h) {

        double oldHeight = height;

        height = h;

        System.out.println("Old Height: " + oldHeight);
        System.out.println("New Height: " + height);

    }

    public void haveBirthday() {

        age = age + 1;

        System.out.println("Happy Birthday " + name);
        System.out.println("Your New Age: " + age);

    }

    public static void showTotalPeople() {

        System.out.println("Total People: " + totalPeople);

    }

}


