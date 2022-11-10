package ming;

public class Person {
    private String name;
    private int age;

    //    构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static int score = 100;
}
