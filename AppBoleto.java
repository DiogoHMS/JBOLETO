import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class AppBoleto {

    public static void main(String[] args) {
//paymentSlip = boleto
// bankcustomer - cliente Banco
//payer = sacado
// payee = cedente
//control shif o para atualizar dependencia
// final = nao inibe o setter

        Boleto boleto1 = Boleto.builder()
                .codigo(UUID.randomUUID().toString())
                .datavencimento(LocalDate.now().plusMonths(1))
                .valorBoleto(new BigDecimal("300.00"))
                .sacado(ClienteBanco.builder()
                        .codigosacado(UUID.randomUUID().toString())
                        .nome("João")
                        .agencianumero("2020")
                        .contanumero("12345")
                        .saldo(new BigDecimal("150.00"))
                        .build())
                .cedente(ClienteBanco.builder()
                        .codigosacado(UUID.randomUUID().toString())
                        .nome("Pedro")
                        .agencianumero("2021")
                        .contanumero("12345")
                        .saldo(new BigDecimal("200.00"))
                        .build())
                .build();


        ClienteBanco diogo = ClienteBanco.builder()
                .codigosacado(UUID.randomUUID().toString())
                .nome("Diogo")
                .saldo(new BigDecimal("150.00"))
                .build();


        System.out.println(boleto1.gerarCodigoDeBarras());

        System.out.println(boleto1);


    }


}

