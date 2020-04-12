import java.time.LocalDate;

public class Person {
    String nick;
    String password;
    LocalDate registration;

    public Person(String nick, String password, LocalDate registration) {
        this.nick = nick;
        this.password = password;
        this.registration = registration;
    }

    @Override
    public String toString() {
        return String.format("{nick: %s; password: %s; registration: %s}", nick, password, registration);
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return person.nick == nick && person.password == password && person.registration == registration;
    }

}