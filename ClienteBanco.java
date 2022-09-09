import lombok.*;
import java.math.BigDecimal;

@Data
@Builder
public class ClienteBanco {

    private final String codigosacado;
    private final String nome;
    private final String agencianumero;
    private final String contanumero;
    private final BigDecimal saldo;


}

