/**
 *
 * @author Usuario
 */
public class ConversorCentPulg extends Conversor {

    private static final String CENTIMETROS = "Centimetros";
    private static final String PULGADAS = "Pulgadas";
    public static final double UNA_PULGADA = 2.54;
    
    @Override
    public String getTipo() {
        return CENTIMETROS+" a "+PULGADAS; 
    }
    
    @Override
    public String getLabel1() {
        return CENTIMETROS; 
    }
    
    @Override
    public String getLabel2() {
        return PULGADAS; 
    }

    @Override
    public Double convertirValorUnoaValorDos(Double valorUno) {
        return valorUno / UNA_PULGADA;
    }
    
    @Override
    public Double convertirValoDosaValorUno(Double valorDos) {
        return valorDos * UNA_PULGADA;
    }
    
}
