package by.academy.hw2.task1;

public enum Country implements ICountryParameters {

    BELARUS(207600, 10300500), RUSSIA(17075200, 143420300),
    CANADA(9976140, 3280500), USA(9629091, 295734100),
    CHINA(9596960, 1306313800), KAZAKHSTAN(2717300, 1518500),
    MEXICO(1972550, 106202900), UKRAINE(603700, 47425300),
    SWEDEN(449964, 9001800), CUBA(110860, 11346700);

    private int area;
    private int strength;

    Country(int area, int strength) {
        this.area = area;
        this.strength = strength;
    }

    public int getArea() {
        return area;
    }

    public int getPeopleStrength() {
        return strength;
    }
}