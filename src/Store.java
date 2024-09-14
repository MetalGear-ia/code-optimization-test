public class Store {
    public static void main(String[] args) {
        final int PRODUCT1 = 15;
        final int PRODUCT2 = 10;
        final int PRODUCT3 = 5;
         
        int precios[]={PRODUCT1 * 2, PRODUCT2 * 3, PRODUCT3 * 4 };//Ingresa en arrays los precios de cada producto.

        int totalSales = precios[0] + precios[1] + precios[2];

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}
