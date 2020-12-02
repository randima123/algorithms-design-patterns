public class Rabbit extends Animal {

    private String name;
    private int age;

    public Rabbit(String name) {
        super(name);

    }

    public Rabbit() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    @Override
    public void run() {
        System.out.println("Rabbit run");
    }

    public void loading(int num) {
    }

    public int loading(int num2, int num3) {
        return 1;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void abs() {

    }
}
