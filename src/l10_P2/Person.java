package l10_P2;

public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (age > 0)
        this.age = age;
        else {
            System.out.println("Incorrect age.");
            System.exit(0);
        }
    }
    public void getInfo() {
        System.out.printf("%s, %d years old.", name, age);
    }
}
