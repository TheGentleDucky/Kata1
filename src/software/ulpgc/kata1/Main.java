package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Esqueleto Marcelo = new Esqueleto("Marcelo", 206, LocalDate.of(1999,4,1));
        System.out.println(Marcelo.getName() + "nació el " + Marcelo.getBirthdate() + ", tiene "+ Marcelo.getAge() + " años y conserva "+ Marcelo.getNumHuesos() + " huesos.");
    }
}
