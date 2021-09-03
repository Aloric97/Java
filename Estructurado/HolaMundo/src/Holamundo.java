
import java.util.Scanner;




public class Holamundo {
    public static void main (String args []){
        int posicion =1;  int cantidad=0; int suma=0;
  
        System.out.print("ingrese el numero:");
        Scanner consola = new Scanner(System.in);
        int numero = consola.nextInt();
        
        while (numero<=1 || numero >=500){
        
            System.out.println("Error, ha ingresado un valor fuera de rango(1..500). Por favor, vuelva a ingresar");
            numero = consola.nextInt();
        }
           
        while (numero<=500){
            if (posicion % 8 ==0){
               cantidad = cantidad +1;
               suma =suma+8;
            }
            numero = numero + 1;
            posicion= posicion +1;
        
            
        }
        System.out.println("la cantidad de valores desde de la posicion de entrada hasta 500, contando 8 posiciones, son:" + cantidad);
        System.out.println("la sumatoria desde la posicion de entrada hasta 50 es:" + suma);
        
    }
    
}

