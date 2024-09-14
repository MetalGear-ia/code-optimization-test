import java.util.Scanner;
public class AgeValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad:");
        final int AGE_LIMIT = scanner.nextInt(); //En la constante si es mayor o igual a 18 aparece "Acces granted" sino "Acces denied"
        
        if (AGE_LIMIT >= 18) {
            System.out.println("Access granted");
        }else {
            System.out.println("Access denied");
        }
        scanner.close();
    }
}
