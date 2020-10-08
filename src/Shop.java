public class Shop {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "jajka";
        product1.manufacturer = "Ferma";
        product1.availability = 100;
        product1.amount = 121.15;

        Product product2 = new Product();
        product2.name = "śmietana";
        product2.manufacturer = "Zott";
        product2.availability = 1000;
        product2.amount = 1.13;

        System.out.println("nazwa: " + product1.name
            + ", producent: " + product1.manufacturer
            + ", cena: " + product1.amount
            + ", dostępność: " + product1.availability);

        System.out.println("nazwa: " + product2.name
                + ", producent: " + product2.manufacturer
                + ", cena: " + product2.amount
                + ", dostępność: " + product2.availability);

    }

}
