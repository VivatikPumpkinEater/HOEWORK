package by.academy.hw2.task1;

import java.util.Comparator;

public class CountryPeopleComparator implements Comparator<Country> {

    @Override
    public int compare(Country num0, Country num1) {

        if (num0.getPeopleStrength() == num1.getPeopleStrength()) {
            return 0;
        }
        if (num0.getPeopleStrength() > num1.getPeopleStrength()) {
            return 1;
        } else {
            return -1;
        }
    }
}
