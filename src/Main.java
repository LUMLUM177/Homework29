import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void addProducts(Product product, Set<Product> Set) throws DuplicateProductException {
        Iterator<Product> it = Set.iterator();
        while (it.hasNext()) {
            Product product2 = it.next();
            if (product.getProductName().equals(product2.getProductName())) {
                throw new DuplicateProductException("Нельзя добавить уже имеющийся продукт!");
            }
        }
        Set.add(product);
    }

    public static void main(String[] args) throws NullFillingDataException, DuplicateProductException {

        Product banana = new Product("Банан", 50, 5);
        Product orange = new Product("Апельсин", 100, 4);
        Product apple = new Product("Яблоко", 70, 3);
        Product kiwi = new Product("Киви", 150, 2);
        Product milk = new Product("Молоко", 80, 1);
        Product banana2 = new Product("Банан", 50, 5);

        Set<Product> products = new HashSet<>();
        addProducts(banana, products);
        addProducts(orange, products);
        addProducts(apple, products);
        addProducts(kiwi, products);
        addProducts(milk, products);
//        addProducts(banana2, products);

        System.out.println(products);

        products.remove(apple);
        products.remove(orange);
        products.remove(milk);
        products.remove(banana2);

        System.out.println(products);


    }
}