import java.util.Scanner;

public class mcd{

	    public static void main(String[] args) {
	         Scanner teclado = new Scanner(System.in);
             
              int num1, num2;
              boolean mcd = false;

              while(true) {
                System.out.println("Ingrese el primer numero: ");
                num1 = teclado.nextInt();

                System.out.println("Ingrese el segundo numero: ");
                num2 = teclado.nextInt();

                if(num1 > 0 && num2 > 0 && num1 !=num2){
                    
                    if(num1>num2){

                        int aux = num1;
                        num1 = num2;
                        num2 = aux;
                    }
                    
                    int i = num1;
                    
                    while (!mcd && i>=1){
                        
                        if (num1 % i == 0 && num2 % i == 0){
                            
                            System.out.println("El maximo común divisor es: " + i);
                            mcd = true;
                        }

                        else {
                            i--;
                        }
                    }

                    {break;}
                        
                }

                else {
                    if (num1 == num2){

                        System.out.println("Los numeros ingresados son iguales. " 
                        + "Intentalo nuevamente.");
                    }
                }
            }
        }

}	            