public class BuilderPattern {

    p s v m() {
        Product p1 = new Product("name", 1);
        Product p1 = new Product("name", 1);
        Product p1 = new Product("name", 1);
        Product p1 = new Product("name", 1);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, 4);
        Product p111 = new Product("name", 1, ["rev1","rev2"]);

        ProductBuilder pb = new ProductBuilder();
        pb.withName("nwe");
        pb.withRating(1);
        Product p1 = pb.build();
    }

}

class Product {
    int price;
    String name;
    int rating = 0;
    String[] reviews;
    String description;

}

class ProductBuilder {

    Product product = new Product();
    public withName(String name) {
        product.name = name;
    }

    public withPrice(int price) {

    }

    public withRating(int rating) {

    } 

    public withReviews(String[] r) {

    }

    public withDesc(String r) {

    }

    public Product build() {
        if(product.name == null) {
            throw new Exception("product should have name");
        }
        return product;
    }

}