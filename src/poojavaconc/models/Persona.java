package poojavaconc.models;

/**
 *
 * @author Ruben
 */
public abstract class Persona {
    
    public Persona(String name){
        this.name = name;
    }
    private String name;
    
    
    public abstract String getAtributosString();
    public abstract int getId();
    
    public String getName(){
        return name;
    }
}
