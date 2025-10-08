package software.ulpgc.kata1;

import java.time.LocalDate;

public class Esqueleto {
    private final String name;
    private final LocalDate birthday;
    private final int numHuesos;

    public Esqueleto(String name, LocalDate birthday, int numHuesos) {
        this.name = name;
        this.birthday = birthday;
        this.numHuesos = numHuesos;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getNumHuesos() {
        return numHuesos;
    }

    public int getAge(){
        return toYears(LocalDate.now().toEpochDay()- birthday.toEpochDay());
    }

    public int toYears(long days){
        return(int)(days/365.2);
    }
}
