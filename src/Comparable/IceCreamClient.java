package Comparable;

import java.util.*;

public class IceCreamClient {

    public void compareIceCream() {

        IceCream iceCream1 = new IceCream("choco", 120.0, "highland");

        IceCream iceCream2 = new IceCream("choco", 150.0, "highland");

        System.out.println(iceCream1.equals(iceCream2));

        List<IceCream> list = new ArrayList<IceCream>();
        list.add(iceCream1);
        list.add(iceCream2);

        Comparator<IceCream> iceCreamComparator = new Comparator<IceCream>() {
            @Override
            public int compare(IceCream o1, IceCream o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };

        Collections.sort(list, iceCreamComparator);
        System.out.println(list);
    }
}
