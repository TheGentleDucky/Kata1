package software.ulpgc.kata1;

import java.time.LocalDate;

public class Esqueleto {
    private final String name;
    private final LocalDate birthdate;
    private final int numHuesos;

    public Esqueleto(String name, LocalDate birthdate, int numHuesos) {
        this.name = name;
        this.birthdate = birthdate;
        this.numHuesos = numHuesos;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getNumHuesos() {
        return numHuesos;
    }

    public int getAge() {
        return toYears(LocalDate.now().toEpochDay() - birthdate.toEpochDay());

    }
    public int toYears(long days){
        return(int)(days/365.2);
    }
}