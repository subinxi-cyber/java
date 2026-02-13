
class Product {
    int pcode;
    String pname;
    double price;

    Product(int c, String n, double p) {
        pcode = c;
        pname = n;
        price = p;
    }

    void display() {
        System.out.println(pcode + "\t\t" + pname + "\t\t" + price);
    }

    static void findLowest(Product p1, Product p2, Product p3) {
        if (p1.price <= p2.price && p1.price <= p3.price) {
            System.out.println("\nProduct 1 has the lowest price");
        } 
        else if (p2.price <= p1.price && p2.price <= p3.price) {
            System.out.println("\nProduct 2 has the lowest price");
        } 
        else {
            System.out.println("\nProduct 3 has the lowest price");
        }
    }
}

public class ProductDemo {
    public static void main(String args[]) {

        Product obj1 = new Product(101, "Product_1", 100.0);
        Product obj2 = new Product(102, "Product_2", 128.0);
        Product obj3 = new Product(103, "Product_3", 790.0);

        System.out.println("Product information");
        System.out.println("-------------------");
        System.out.println("Product Code\t Product Name\tProduct Price");

        obj1.display();
        obj2.display();
        obj3.display();

        Product.findLowest(obj1, obj2, obj3);
    }
}
