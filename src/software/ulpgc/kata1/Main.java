package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person Juan = new Person("Juan", LocalDate.of(1999, 4, 1));
        System.out.println(Juan.getName()+ " nació el " + Juan.getBirthday() + " y tiene " + Juan.getAge() + " años.");
    }
}
