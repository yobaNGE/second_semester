package l11_P3;

public class Chicken {
    private int age;
    private String name;

    Chicken(String name, int age){
        if (age > 10 || age < 1)
            throw new IllegalArgumentException("Chicken age should be [1;10]");
        if (name.length() < 3)
            throw new IllegalArgumentException("Name is shorter then 3 chars");
        this.age = age;
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int calculateProductPerDay(){
        if (this.age == 1)
            return 0;
        else if (this.age == 10)
            return 1;
        else
            return 5;
    }
    public String showInfo(){
        return String.format("Chicken %s (age %d) can produce %d egg's per week", this.name, this.age, calculateProductPerDay());
    }
}
