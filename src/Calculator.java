import java.math.BigDecimal;

public class Calculator {
    double x;
    double y;
    
    public BigDecimal add() {
        BigDecimal bx = BigDecimal.valueOf(this.x);
        BigDecimal by = BigDecimal.valueOf(this.y);
        BigDecimal result = bx.add(by);
        return result;
    }
    public BigDecimal delete(){
        BigDecimal bx = BigDecimal.valueOf(this.x);
        BigDecimal by = BigDecimal.valueOf(this.y);
        BigDecimal result = bx.subtract(by);
        return result;
    }
    public BigDecimal mul(){
        BigDecimal bx = BigDecimal.valueOf(this.x);
        BigDecimal by = BigDecimal.valueOf(this.y);
        BigDecimal result = bx.multiply(by);
        return result;
    }
    public BigDecimal div(){
        BigDecimal bx = BigDecimal.valueOf(this.x);
        BigDecimal by = BigDecimal.valueOf(this.y);
        BigDecimal result = bx.divide(by);
        return result;
    }
}
