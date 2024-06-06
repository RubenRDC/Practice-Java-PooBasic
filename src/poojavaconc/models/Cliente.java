package poojavaconc.models;

/**
 *
 * @author Ruben
 */
public class Cliente extends Persona {

    private final int idCliente;
    private static int id = 0;

    public Cliente(String name) {
        super(name);
        id++;
        idCliente = id;
        
    }

    @Override
        public String getAtributosString() {
        
        return "El cliente con el Id = "+idCliente+" se llama "+ super.getName();
    }
    public int getId(){
        return idCliente;
    }
}
