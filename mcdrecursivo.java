import java.util.Scanner;

public class mcdrecursivo {
    public static void main(String[] args) {
        System.out.println("El maximo comun divisor de dos numeros");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese el primer valor:");
            int num1 = scanner.nextInt();

            System.out.println("Ingrese el segundo valor:");
            int num2 = scanner.nextInt();

            int mcd = MCD(num1, num2);
            System.out.println("El maximo comun divisor de " + num1 + " y " + num2 + " es: " + mcd);
        }
    }
    public static int MCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return MCD(num2, num1 % num2);
        }
    }
}
