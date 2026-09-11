class Phone {
    double price;
    String brand;
    String Model;

    Phone(double price, String brand, String Model) {
        this.price = price;
        this.brand = brand;
        this.Model = Model;
    }

    void displayInformation() {
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + Model);
    }
}

public class Mobile {
    public static void main(String[] args) {

        Phone phone1 = new Phone(999.99, "Apple", "iPhone 15");
        Phone phone2 = new Phone(799.99, "Samsung", "Galaxy S24");
        Phone phone3 = new Phone(499.99, "Xiaomi", "Redmi Note 13");

        phone1.displayInformation();
        phone2.displayInformation();
        phone3.displayInformation();
    }
}
