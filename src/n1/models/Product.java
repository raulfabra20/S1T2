package n1.models;

public class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }
        //Quitar getters, setters, toString

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {

            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "s1tasca2n1.Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
