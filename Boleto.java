import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
public class Boleto {


    private final String codigo;
    private final LocalDate datavencimento;
    private final ClienteBanco sacado;
    private final ClienteBanco cedente;
    private final BigDecimal valorBoleto;

    private String codigodebarras;


    public String gerarCodigoDeBarras() {
        return codigo + datavencimento + sacado + cedente + valorBoleto;
    }

}
