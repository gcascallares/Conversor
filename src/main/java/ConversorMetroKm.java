
import exceptions.MetroAKilometroException;

/**
 *
 * @author Usuario
 */
public class ConversorMetroKm extends Conversor {
    
    private static final String METROS = "Metros";
    private static final String KILOMETROS = "Kilometros";
    public static final int UN_KILOMETRO = 1000;
    
    @Override
    public String getTipo() {
        return METROS+" a "+KILOMETROS; 
    }
    
    @Override
    public String getLabel1() {
        return METROS; 
    }
    
    @Override
    public String getLabel2() {
        return KILOMETROS; 
    }

    @Override
    public Double convertirValorUnoaValorDos(Double metros) {
            return metros / UN_KILOMETRO;
        
    }
    

    @Override
    public Double convertirValoDosaValorUno(Double metros) {
        return metros * UN_KILOMETRO;
    }
}
