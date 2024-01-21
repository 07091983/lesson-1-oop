package lesson;

import java.util.List;

public class HotDeverageVendingMchine implements HotDeverageVendingMchine{

    private final List<Product> productList;

    private int money;

    public HotDeverageVendingMchine (List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public product getProduct (String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                    money += product.getPrice();
                    return product;
                    
            }
        }
        return null;
        }
    }

    public HotDeverage getProduct(String name, int volume, int temp) {
        for (Product product: productList) {
            if (product instanceof HotDeverage) {
                if (product.getName().equals(name) && ((HotDeverage) product).getVolume() == volume){
                    return (HotDeverage) product;
                }

                if (product.getName().equals(name) && ((HotDeverage) product).getTemp() == temp){
                    return (HotDeverage) product;
                }
                
            }
        } 
        return null;
    }
    
}
