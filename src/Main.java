import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Product banana = new Product("Банан", 50, 5);
        Product orange = new Product("Апельсин", 100, 4);
        Product apple = new Product("Яблоко", 70, 3);
        Product kiwi = new Product("Киви", 150, 2);
        Product milk = new Product("Молоко", 80, 1);
        Product banana2 = new Product("Бананы", 100, 5);

        Set<Product> products = new HashSet<>();
        products.add(banana);
        products.add(orange);
        products.add(apple);
        products.add(kiwi);
        products.add(milk);
        products.add(banana2);

        System.out.println(products);

        products.remove(apple);
        products.remove(orange);
        products.remove(milk);
        products.remove(banana2);

        System.out.println(products);
    }
}