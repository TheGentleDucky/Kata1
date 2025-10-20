package software.ulpgc;

import java.time.LocalDate;

public class Esqueleto {
    private final String name;
    private final int numHuesos;
    private final LocalDate birthdate;

    public String getName() {
        return name;
    }

    public int getNumHuesos() {
        return numHuesos;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public Esqueleto(String name, int numHuesos, LocalDate birthdate) {
        this.name = name;
        this.numHuesos = numHuesos;
        this.birthdate = birthdate;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay() - birthdate.toEpochDay());
    }

    public int toYears(long days){
        return(int)(days/365.2);
    }
}
