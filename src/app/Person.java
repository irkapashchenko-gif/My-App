package app;

class Person {
    private String name;
    private int age;
    private String profession;
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void printInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }
}

