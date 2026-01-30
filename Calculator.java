public class Calculator {
    // The Main method: Entry point for Jenkins to execute
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        double p = 1000.0; // Principal
        double r = 5.0;    // Annual interest rate (5%)
        int t = 2;         // Years
        int n = 12;        // Compounded monthly

        double amount = calc.calculateCompoundInterest(p, r, t, n);
        
        System.out.println("--- Compound Interest Calculator ---");
        System.out.printf("Principal: $%.2f\n", p);
        System.out.printf("Annual Interest Rate: %.2f%%\n", r);
        System.out.printf("Future Value after %d years: $%.2f\n", t, amount);
    }

    // The Logic method: Performs the actual math
    public double calculateCompoundInterest(double principal, double rate, int time, int n) {
        // Formula: A = P(1 + r/n)^(nt)
        return principal * Math.pow(1 + (rate / (n * 100)), n * time);
    }
}

