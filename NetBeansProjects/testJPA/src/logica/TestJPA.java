
package logica;

import Persistencia.ControladoraPersistencia;
import java.util.Date;


public class TestJPA {

  
    public static void main(String[] args) {
        
        Alumno alumno = new Alumno("40035310", "Leandro", "Tombetta", new Date("09/2/2021"));
        
        ControladoraPersistencia control= new ControladoraPersistencia();
        control.CrearAlumno(alumno);
        
    }
    
}
