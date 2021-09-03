
import java.util.Arrays;
import java.util.Scanner;


public class NewClass {
    public static void main(String args[]){
        Boolean bandera = true;
        while (bandera){
        
        String[] puestos={"repositor", "cajero", "supervisor"};
        
        
        System.out.println("Ingrese el puesto que trabaja su empleado  0-repositor. 1-cajero. 2-supervisor");
        Scanner consola = new Scanner(System.in);
        int opcion = consola.nextInt();
        
        while (opcion<0 || opcion>2) {
            System.out.println("por favor vuelva a ingresar un valor correcto");
            System.out.println(" 0-repositor. 1-cajero. 2-supervisor");
            opcion = consola.nextInt();
        
        }
        
            if (opcion == 0) {
                System.out.println("has seleccionado la opcion de: " + puestos[opcion]);
                double ingreso = 15890 +(15890*0.10);
                System.out.println("el sueldo final es de: " + ingreso);
            } else if (opcion ==1){
            
                System.out.println("has seleccionado la opcion de: " + puestos[opcion]);
                double ingreso = 25630.12;
                System.out.println("el sueldo final es de: " + ingreso);
            }else{
                System.out.println("has seleccionado la opcion de: " + puestos[opcion]);
                double ingreso = 35560.20 - (35560.20*0.20);
                System.out.println("el sueldo final es de: " + ingreso);}
            
            System.out.println("desea calcular el ingreso de otro empleado?");
            System.out.println("1-SI 2-NO");
            int opcion2 = consola.nextInt();
            while (opcion2 <0 || opcion2 >2) {
                System.out.println("por favor vuelva a ingresar un valor correcto");
                System.out.println(" 1-SI 2-NO");
                opcion2 = consola.nextInt();
            }
            if (opcion2== 2){
                System.out.println("hemos finalizado la carga de datos");
                bandera= false;
            }
        }
      
    }
}
