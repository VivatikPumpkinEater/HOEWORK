package by.academy.hw2.task1;

import java.util.Comparator;

public class CountryAreaComparator implements Comparator<Country> {

    @Override
    public int compare(Country num0, Country num1) {

        if (num0.getArea() == num1.getArea()) {
            return 0;
        }
        if (num0.getArea() > num1.getArea()) {
            return 1;
        } else {
            return -1;
        }
    }
}