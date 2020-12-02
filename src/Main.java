import AbstractFactory.Product;
import AbstractFactory.ProductFactory;
import Builder.BankAccount;
import Builder.Client;
import Comparable.IceCreamClient;
import DecoPattern.DecoratorClient;
import Decorator.*;
import Sorting.BinarySearch;
import Sorting.BubbleSort;
import Sorting.MergeSort;
import Sorting.QuickSort;
import javafx.scene.input.KeyCode;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> arrList = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(
                arrList.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .reduce(0, (carry, e) -> carry + e));


        System.out.println(
                arrList.stream()
                        .filter(e -> e % 2 == 0)
                        .map(e -> e * 2)
                        .collect(Collectors.toList()));

        System.out.println(
                arrList.stream()
                        .filter(e -> e > 3)
                        .filter(e -> e % 2 == 0)
                        .findFirst()
                        .map(e -> e * 2)
        );

        Rabbit animal = new Rabbit("test");
        System.out.println(animal);
        Rabbit rab = new Rabbit();

        List<? extends Animal> dogs1 = new ArrayList<Animal>();
        //Compilation error
//        dogs1.add(rab);

        Sample sample = new Sample();
        int[] arr = {2, 3, 4, 5,};
        sample.reversArray(arr);
        sample.swapFirstLast("I love coding");

//        Decorator Pattern
        Pizza pizza = new CheesePizza();
        PizzaDecorator sauceDecorator = new SauceDecorator();
        PizzaDecorator vegeDecorator = new VegeDecorator();
        sauceDecorator.setPizza(pizza);
        vegeDecorator.setPizza(sauceDecorator);
        System.out.println(vegeDecorator.calculateCost());

        Product product = ProductFactory.create("Racket", "Yonex");
        product.read();

        int[] arr2 = {3, 1, 5, 2, 8, 4};
        BubbleSort.swapSort(arr2);
        BubbleSort.insertionSortRecursion(arr2, 1);

        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr2, 0, 5);
        System.out.println(Arrays.toString(arr2));

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr2, 0, 5);
        System.out.println(Arrays.toString(arr2));

        Client client = new Client();
        BankAccount bankAccount = client.getBankAccountInstance();
        System.out.println(bankAccount.toString());

        IceCreamClient iceCreamClient = new IceCreamClient();
        iceCreamClient.compareIceCream();

        Arrays.sort(arr2);
        BinarySearch binarySearch = new BinarySearch();
        int searchIndex = binarySearch.binarySearchRecursive(arr2, 0, arr.length - 1, 8);
        System.out.println(searchIndex);

        DecoratorClient decoratorClient = new DecoratorClient();
        decoratorClient.testDecorator();
        //Compilation error
//      Animal object = new Animal();
        Animal object2 = new Rabbit();

        Rabbit obj3 = new Rabbit();
        obj3.setAge(-1);
        obj3.loading(23, 78);

        Sample sm = new Sample();
//      sm.logic(object);
        sm.logic(object2);
        sm.logic(obj3);
    }
}
