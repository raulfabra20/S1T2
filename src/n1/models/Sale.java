package n1.models;

import java.util.ArrayList;

public class Sale {
    private ArrayList<Product> products;
    private int totalSalePrice;

    public Sale() {
        this.totalSalePrice = 0;
        this.products = new ArrayList<>();
    }

    public int getTotalSalePrice() throws EmptySaleException {
        if(products.isEmpty()){
            throw new EmptySaleException("To make a sale you must first add products.");
        } else {
            int totalPrice = 0;

            for (Product product : products) {
                totalPrice += product.getPrice();
            }
            this.totalSalePrice = totalPrice;
            return totalSalePrice;

        }
        }


    public void addProduct(Product product){
        products.add(product);
    }
    public Product getProduct(int number){
        Product product = products.get(number);
        return product;
    }

    //Crear metodo arrayout of bounds.



        }



