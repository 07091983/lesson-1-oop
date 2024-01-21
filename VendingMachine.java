package lesson;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    public interface InnerVendingMachine {

        Product getProduct(String name);
    }   
        
   /*  }VendingMachine() {
        this.productList = initProduct();
        this.money = 0;
    }


    private List<Product> productList;.
    private Integer money;

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return product;
                
            }
        }
        return null;
    }

    private List<Product> initProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(name: "Молоко", price: "100"));
        products.add(new Product(name: "Вода", price: "50"));
        products.add(new Product(name: "Сухарики Кириешки", price: "30"));
        return products
    } */
    

