package www.rodrigoledesmagarcia.com.mx.controles;

import www.rodrigoledesmagarcia.com.mx.modelo.Cuadrilatero;

import java.util.Scanner;

public class controles {
    public static void main(String[] args) {

        Cuadrilatero cuadrilatero = new Cuadrilatero();

        float lado1, lado2;

        Scanner input = new Scanner(System.in);

        System.out.println("\n "+ "PROGRAMA PARA CALCULAR EL AREA Y PERIMETRO DE UN CAUDRILATERO");
        System.out.print(" Digite el primer lado del cuadrilatero: ");
        lado1 = input.nextFloat();
        System.out.print(" Digite el segundo lado del cuadrilatero: ");
        lado2 = input.nextFloat();

        cuadrilatero.setLado1(lado1);
        cuadrilatero.setLado2(lado2);

        if (lado1 == lado2) {

            System.out.println(" ");
            System.out.println(" El area del cuadrado es: " + cuadrilatero.verArea() + " cm.");
            System.out.println(" El perimetro del cuadrado es: " + cuadrilatero.verPerimetro() + " cm3.");

        } else {
            System.out.println(" ");
            System.out.println(" El area del rectangulo es: " + cuadrilatero.verArea() + " cm.");
            System.out.println(" El perimetro del rectangulo es: " + cuadrilatero.verPerimetro() + " cm3.");
        }


    }
}
