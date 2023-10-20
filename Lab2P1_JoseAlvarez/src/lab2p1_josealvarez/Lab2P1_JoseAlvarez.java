/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_josealvarez;
import java.util.Scanner;
public class Lab2P1_JoseAlvarez {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido. Ingrese 1 para determinar triangulo. 2 para Area de figuras 3 para evaluar numeros y 4 para salir: ");
        double opcion = leer.nextDouble();
        
        if (opcion == 1){
        System.out.println("Ingrese la primera medida de su triangulo: ");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese la segunda medida de su triangulo: ");
        double num2 = leer.nextDouble();
        System.out.println("Ingrese la tercera medida de su triangulo: ");
        double num3 = leer.nextDouble();
        
        if (num1 >= 0 && num2 >= 0 && num3 >= 0){
            if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1){
            System.out.println("Las longitudes ingresadas forman un triangulo");
            }
        
        else if(num1 + num2 < num3 && num1 + num3 < num2 && num2 + num3 < num1 ){
            if (num1 + num2 < num3 && num1 + num3 < num2 && num2 + num3 < num1 ){
             System.out.println("Las longitudes ingresadas no forman un triangulo");
            } 
            
        }
        
        
        } else {
        System.out.println("Las longitudes ingresadas no pueden ser negativas");
        
        }
        }
        
        if (opcion == 2){
        System.out.println("Ingrese la figura a la que desea calcularle el area: ");
        int numfigura = leer.nextInt();
           if (numfigura == 1){
            System.out.println("Ingrese la base del triangulo: ");
            int base = leer.nextInt();
        
            System.out.println("Ingrese la altura del triangulo: ");
            int altura = leer.nextInt();
           
            double formulatrian = 0.50 * base * altura;
            
            System.out.println("El area del triangulo es: " + formulatrian);
           }
           
        else if (numfigura == 2){
           System.out.println("Ingrese la base del rectangulo: ");
            int baserectangulo = leer.nextInt();
        
            System.out.println("Ingrese la altura del rectangulo: ");
            int alturarectangulo = leer.nextInt();
           
            int formularectangulo = baserectangulo * alturarectangulo;
            
            System.out.println("El area del triangulo es: " + formularectangulo);
            }
        
        
        else {
        System.out.println("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
        
        System.out.println("Ingrese el radio del circulo: ");
        double radio2 = leer.nextDouble();
        
        double circuloform = radio * radio2 * Math.PI;
        
        System.out.println("El area del circulo es: " + circuloform );
        }
        }
        
        if (opcion == 3){
        System.out.println("Ingrese el numero que desea evaluar: ");
        int num = leer.nextInt();
         if (num % 2 == 0);
         
         while (num % cont)
        }
        
    }
    
}
