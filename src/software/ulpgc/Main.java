package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Esqueleto Juan = new Esqueleto("Juan", 205, LocalDate.of(2002, 5,  21));
    System.out.println(Juan.getName() + " nació el  " + Juan.getBirthdate() + ", por lo que tiene " + Juan.getAge() + " años y conserva " + Juan.getNumHuesos() + " huesos intactos.");
    }
}
