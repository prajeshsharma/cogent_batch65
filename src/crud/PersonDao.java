package crud;

import java.util.Scanner;

public class PersonDao {

    Scanner sc = new Scanner(System.in);
    public void create(Person[] people, int i) {
        Person person = new Person();
        people[i] = person;
        System.out.println("Please enter the ID");
        int id = sc.nextInt();
        sc.nextLine();
        people[i].setId(id);
        System.out.println("Please enter the name");
        String name = sc.nextLine();
        people[i].setName(name);
        System.out.println("Please enter the Address");
        String address = sc.nextLine();
        people[i].setAddress(address);
    }

    public void read(Person[] people) {
        for (Person person : people)
            System.out.println("Person ID is: " + person.getId() + "\nPerson name is: " + person.getName() +
                    "\nPerson address is: " + person.getAddress());

    }
}
