package by.academy.hw2.task1;

public class Main {

    public static void main(String[] args) {

        Country countryInfo = Country.CANADA;
        System.out.println(countryInfo);

        Country countryRefactorString = Country.valueOf("UKRAINE");
        System.out.println(countryRefactorString == countryInfo);
        Country countryInfo1 = Country.BELARUS;
        System.out.println(countryInfo1.compareTo(countryRefactorString));

        CountryAreaComparator comparatorArea = new CountryAreaComparator();
        Country comparatorCountry = Country.CUBA;
        Country comparatorCountry1 = Country.RUSSIA;
        int areaComparatorOut = comparatorArea.compare(comparatorCountry, comparatorCountry1);
        switch (areaComparatorOut) {
            case 0:
                System.out.println(comparatorCountry + " and " + comparatorCountry1 + " same area");
                break;
            case 1:
                System.out.println("area " + comparatorCountry + " is more than area " + comparatorCountry1);
                break;
            case -1:
                System.out.println("area " + comparatorCountry + " is less than area " + comparatorCountry1);
                break;
        }
        //bonus
        System.out.println();

        CountryPeopleComparator comparatorPeople = new CountryPeopleComparator();
        Country countPeople = Country.MEXICO;
        Country countPeople1 = Country.USA;
        int peopleComparatorOut = comparatorPeople.compare(countPeople, countPeople1);
        switch (peopleComparatorOut) {
            case 0:
                System.out.println("count people " + countPeople + " and " + countPeople1 + " same");
                break;
            case 1:
                System.out.println("count people " + countPeople + " is more than strength " + countPeople1);
                break;
            case -1:
                System.out.println("count people " + countPeople + " is less than strength " + countPeople1);
                break;
        }
    }
}