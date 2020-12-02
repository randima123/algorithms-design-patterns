import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String name;

    public Animal() {
        System.out.println("parent");
    }

    public Animal(String name) {
        this.name = "test name";
    }

    public abstract void abs();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void test(List<? super Number> list) {
//        list.add(1);
        int count = 2;
        list.add(count);
    }

    public void run() {
        System.out.println("Animal run");
    }
}
