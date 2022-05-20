import java.math.BigDecimal;

public interface IBankFunction {
    String makeWithdrawal(BigDecimal funds);

    String makeDeposit(BigDecimal funds);
}
