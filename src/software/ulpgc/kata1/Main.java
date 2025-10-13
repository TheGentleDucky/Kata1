package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Esqueleto marcelo= new Esqueleto("Marecelo", LocalDate.of(1999, 4, 1), 206);
        System.out.println(marcelo.getName() + " nació el  " + marcelo.getBirthdate() + ", por lo que tiene " + marcelo.getAge() + " años y cuenta con " + marcelo.getNumHuesos() + " huesos.");
    }
}
