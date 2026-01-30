public class Calculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double p = 1000.0; // Principal
        double r = 5.0;    // Annual interest rate (5%)
        int t = 2;         // Years
        int n = 12;        // Compounded monthly

        double amount = calc.calculateCompoundInterest(p, r, t, n);
        
        System.out.println("--- Compound Interest Calculator ---");
        System.out.printf("Principal: $%.2f\n", p);
        System.out.printf("Future Value after %d years: $%.2f\n", t, amount);
    }
}

