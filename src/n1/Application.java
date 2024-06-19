package n1;

import n1.models.EmptySaleException;
import n1.models.Product;
import n1.models.Sale;


public class Application {

    public static void testApplication() {

        Sale sale = new Sale();

        try{
            int totalPrice = sale.getTotalSalePrice();
            if(totalPrice>0){
                System.out.println("The total sale price is: "+sale.getTotalSalePrice()+" €");
            }
        } catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }

        //Prove that IndexOutOfBoundsException works:

        Product product1 = new Product("Jeans", 45);
        Product product2 = new Product("Shirt", 25);
        Product product3 = new Product("Socks", 4);

        sale.addProduct(product1);
        sale.addProduct(product2);
        sale.addProduct(product3);

        try {
            sale.getProduct(4);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds exception");
        }

    }

}
