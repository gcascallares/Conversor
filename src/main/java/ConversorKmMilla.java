
/**
 *
 * @author Usuario
 */
public class ConversorKmMilla extends Conversor {
    private static final String KILOMETROS = "Kilometros";
    private static final String MILLAS = "Millas";
    public static final Double UNA_MILLA = 1.609;
    
    @Override
    public String getTipo() {
        return KILOMETROS+" a "+MILLAS;
    }

    @Override
    public String getLabel1() {
        return KILOMETROS;
    }

    @Override
    public String getLabel2() {
        return MILLAS;
    }

    @Override
    public Double convertirValorUnoaValorDos(Double valorUno) {
        return valorUno / UNA_MILLA;
    }

    @Override
    public Double convertirValoDosaValorUno(Double valorDos) {
        return valorDos * UNA_MILLA;
    }
}
