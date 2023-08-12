import Mijo.ScrumMaster;
import PADRE.Empleado;

public class Main {
    public static void imprime(Empleado emple){
        System.out.println("objeto.ObtenerDetalles()="+  emple.ObtenerDetalles());
    }

    public static void determinarTipo (Empleado emple){
        if(emple instanceof ScrumMaster){
            System.out.println("Es de tipo ScrumMaster");
        }else if  (emple instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }else if (emple instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
 public static void main(String[] args){
     Empleado empleado = new Empleado("Juan",1000);
//     System.out.println(empleado.ObtenerDetalles());
//
//     ScrumMaster sm= new ScrumMaster("Homero",5000,"Jutiapa");
//     System.out.println(sm.ObtenerDetalles());
     determinarTipo(empleado);
     ScrumMaster sm= new ScrumMaster("Homero",5000,"Jutiapa");
     determinarTipo(sm  );
     System.out.println(empleado.toString());
 }

}