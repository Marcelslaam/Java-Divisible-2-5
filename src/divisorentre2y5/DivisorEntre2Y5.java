
package divisorentre2y5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorEntre2Y5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido.. ingrese un numero para saber si es divisible entre 2 y 5");
        esDivisible(leer);
    }
    public static void esDivisible(Scanner leer){
        System.out.println("Ingrese un numero");
        boolean siEsDivisible = true;
                
        try {
            double valor = leer.nextDouble();
            esDivisibleSioNo(leer, valor);
        } catch (InputMismatchException e) {
            System.out.println("No insertaste el numero correctamente");
        }
        System.out.println("Programa completo!!!");
        
        
    }
    public static void esDivisibleSioNo(Scanner leer, double valor){
        
            double valor1 = valor % 2;
            double valor2 = valor % 5;
            
            if (valor1 == 0.0 && valor2 == 0.0) {
                System.out.println("Si es divisible por 2 y 5");
            }else if (valor1 == 0.0 && valor2 != 0.0) {
                System.out.println("Es divisible por 2 || no es divisble por 5");
            }else if (valor2 == 0.0 && valor1 != 0.0) {
                System.out.println("Es divisible por 5 || no es divisble por 2");
            }
    }
}
