package poojavaconc.models;

/**
 *
 * @author Ruben
 */
public class Empleado extends Persona {

    private final int idEmpleado;
    private static int id = 0;
    private String sector;
    private double sueldo;

    public Empleado(String name,String sector,double sueldo) {
        super(name);
        id++;
        idEmpleado = id;
        this.sector= sector;
        this.sueldo = sueldo;
        
    }

    @Override
    public String getAtributosString() {
        return "El Empleado con el Id = "+idEmpleado+" se llama "+ super.getName()+" se encuentra en el sector de "+sector+" con un sueldo de $"+sueldo;
    }

    @Override
    public int getId() {
        return idEmpleado;
    }
    
    public String renunciar(){
        return "El emplead@ "+super.getName()+" con el id '"+idEmpleado+"' a decidido renunciar.";
    }

}
