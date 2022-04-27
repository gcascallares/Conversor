
/**
 *
 * @author Usuario
 */
public class ConversorCentCubicLitro extends Conversor {

    private static final String CENTRIMETROCUBICOS = "Centrimetros Cubicos";
    private static final String LITROS = "Litros";
    public static final int UN_LITRO = 1000;
    
    @Override
    public String getTipo() {
        return CENTRIMETROCUBICOS+" a "+LITROS;
    }

    @Override
    public String getLabel1() {
        return CENTRIMETROCUBICOS;
    }

    @Override
    public String getLabel2() {
        return LITROS;
    }

    @Override
    public Double convertirValorUnoaValorDos(Double valorUno) {
        return valorUno / UN_LITRO;
    }

    @Override
    public Double convertirValoDosaValorUno(Double valorDos) {
        return valorDos * UN_LITRO;
    }
    
}
