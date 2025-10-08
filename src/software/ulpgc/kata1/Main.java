package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Esqueleto Marcelo = new Esqueleto("Marcelo", LocalDate.of(1999, 4 ,1), 206);
        System.out.println(Marcelo.getName() + " nació el " + Marcelo.getBirthday() + " y tiene " + Marcelo.getAge() + " años. Tiene " + Marcelo.getNumHuesos() + " huesos.");
    }
}
