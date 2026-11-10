package app;

public class Main {
    public static void main(String[] args) {
        System.out.print("1. ");

        Person john = new Person("John", 30, "Інженер");
        Person mary = new Person("Mary", 25, "Вчитель");
        Person bob = new Person("Bob", 35, "Лікар");

        john.printInfo();
        System.out.print("   ");
        mary.printInfo();
        System.out.print("   ");
        bob.printInfo();
        System.out.println();

        System.out.print("2. ");
        Person alice = new Person("Alice", 28, "Архітектор");
        alice.printInfo();

        System.out.println("   (Після оновлення професії)");
        alice.setProfession("Дизайнер");

        System.out.print("   ");
        alice.printInfo();
    }
}

