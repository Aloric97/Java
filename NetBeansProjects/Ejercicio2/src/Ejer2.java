
 
import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        
        System.out.println("Escribe un numero");
        Scanner consola = new Scanner(System.in);
        int paquetes = consola.nextInt();
        
        if (paquetes <=5) {
            System.out.println("No se permiten compras menores a 5...");
            
        } else if (paquetes>5 && paquetes<=15) {
            System.out.println("Su costo de envio es de 200 ");
            
        }else{
            System.out.println("El envio es gratuito");
        }
        
    }
    
}
