package poojavaconc;

import poojavaconc.models.Cliente;
import poojavaconc.models.Empleado;
import poojavaconc.models.Persona;

/**
 *
 * @author Ruben
 */
public class PooJavaConc {

    public static void main(String[] args) {
        
        Persona[] personas = new Persona[10];
        
        personas[0] = new Cliente("Carlos");
        personas[1] = new Cliente("Sebastian");
        personas[2] = new Cliente("Cristian");
        personas[3] = new Cliente("Juan");
        personas[4] = new Cliente("Ruben");
        
        personas[5] = new Empleado("Uriel","Administracion",204080);
        personas[6] = new Empleado("Pablo","RRHH",127600);
        personas[7] = new Empleado("Pedro","Programadocion",608000);
        personas[8] = new Empleado("Cristina","Seguridad",722000);
        personas[9] = new Empleado("Mauricio","Control de Stock",279050);
        
        for (Persona persona : personas) {
            System.out.println(persona.getAtributosString());
        }
        
        Empleado emplCast = (Empleado) personas[8];
        
        System.out.println(emplCast.renunciar());
        
        
    }

}
