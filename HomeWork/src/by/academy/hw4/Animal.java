public class Animal {
    String nick;
    int age;

    public Animal(String nick, int age) {
        this.nick = nick;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("{nick: %s; Age: %s}", nick, age);
    }

    @Override
    public boolean equals(Object obj) {
        Animal animal = (Animal) obj;
        return nick == animal.nick && age == animal.age;
    }

}