import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int counter = 100000; //работоспособность проверил на 10000 ибо мой компудахтер никак не хочет с 100 000 дружить(

        Person[] person = new Person[counter];
        DataContainer<Person> dataContainerPerson = new DataContainer<>(person);

        for (int i = 0; i < person.length; i++) {
            dataContainerPerson.add(new Person(setNick(), setPassword(), setRegistration()));
        }

        System.out.println("Person database: ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        DataContainer.sort(dataContainerPerson, new PersonRegistrationComparator());
        System.out.println("Person database sort: ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        dataContainerPerson.delete(1);
        System.out.println("Person database delete: ");
        System.out.println(Arrays.toString(dataContainerPerson.getData()));

        System.out.println("Equals date registration");
        compareDates(person[123], person[321]);

        System.out.println("Animal database:");
        Animal[] animal = new Animal[counter];
        DataContainer<Animal> dataContainerAnimal = new DataContainer<>(animal);
        for (int i = 0; i < animal.length; i++) {
            dataContainerAnimal.add(new Animal(setNick(), setAge()));
        }
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));

        DataContainer.sort(dataContainerAnimal, new AnimalAgeComparator());
        System.out.println("Animal database sort:");
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));

        System.out.println("Animal database delete:");
        dataContainerAnimal.delete(animal[1]);
        System.out.println(Arrays.toString(dataContainerAnimal.getData()));

        System.out.println("Equals animal age");
        compareAge(animal[432], animal[395]);
    }

    private static String setNick() {
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        int num;
        char symb;
        String nck = new String();
        for (int i = 0; i < 6; i++) {
            num = (int) (Math.random() * 52);
            symb = alphabet.charAt(num);
            nck += symb;

        }
        return nck;
    }

    private static String setPassword() {
        String password = "0123456789AaBbCcDd";
        int numb;
        char symb;
        String pas = new String();
        for (int i = 0; i < 6; i++) {
            numb = (int) (Math.random() * 18);
            symb = password.charAt(numb);
            pas += symb;
        }
        return pas;
    }

    private static LocalDate setRegistration() {
        Random random = new Random();
        int minDay = (int) LocalDate.of(2000, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2020, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);
        LocalDate rgDate = LocalDate.ofEpochDay(randomDay);
        return rgDate;
    }

    private static int setAge() {
        int age;
        age = (int) (1 + Math.random() * 21);
        return age;
    }

    private static void compareDates(Person o1, Person o2) {
        PersonRegistrationComparator registrationComparator = new PersonRegistrationComparator();

        switch (registrationComparator.compare(o1, o2)) {
            case 0: {
                System.out.printf("User %s registration after %s \n", o2.nick, o1.nick);
                break;
            }
            case 1: {
                System.out.printf("User %s registration after %s \n", o1.nick, o2.nick);
                break;
            }
            case -1: {
                System.out.println("OOPS=(\n");
                break;
            }

        }

    }

    private static void compareAge(Animal o1, Animal o2) {
        AnimalAgeComparator ageComparator = new AnimalAgeComparator();
        switch (ageComparator.compare(o1, o2)) {
            case 0: {
                System.out.printf("%s is older %s \n", o2.nick, o1.nick);
                break;
            }
            case 1: {
                System.out.printf("%s is older %s \n", o1.nick, o2.nick);
                break;
            }
            case 2: {
                System.out.printf("%s and %s are peers \n", o2.nick, o1.nick);
                break;

            }
            case -1: {
                System.out.println("OOPS=(\n");
                break;
            }
        }

    }

}