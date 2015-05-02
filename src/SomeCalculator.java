import java.math.BigDecimal;

public class SomeCalculator {
    public BigDecimal addToTen()
    {
        BigDecimal value = new BigDecimal(10);
        value.add(new BigDecimal(22));
        System.out.println(value);
        return value;
    }
}