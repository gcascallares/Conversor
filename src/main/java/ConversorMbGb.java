
/**
 *
 * @author Usuario
 */
public class ConversorMbGb extends Conversor {
            private static final String MEGABYTE = "Megabyte";
    private static final String GIGABYTE = "Gigabyte";
    public static final int UN_GIGABYTE = 1024;
    
    @Override
    public String getTipo() {
        return MEGABYTE+" a "+GIGABYTE;
    }

    @Override
    public String getLabel1() {
        return MEGABYTE;
    }

    @Override
    public String getLabel2() {
        return GIGABYTE;
    }

    @Override
    public Double convertirValorUnoaValorDos(Double valorUno) {
        return valorUno / UN_GIGABYTE;
    }

    @Override
    public Double convertirValoDosaValorUno(Double valorDos) {
        return valorDos * UN_GIGABYTE;
    }
}
