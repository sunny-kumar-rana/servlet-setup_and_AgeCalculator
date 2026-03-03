package Main;

import java.time.LocalDate;

public class AgeCalculator {
    public int calculateAge(int birthYear) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }
}