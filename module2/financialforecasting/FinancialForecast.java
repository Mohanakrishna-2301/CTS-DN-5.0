package module2.financialforecasting;

public class FinancialForecast 
{
    // Recursive method
    public static double futureValue(double presentValue, double growthRate, int years) 
    {
        // Base Case
        if (years == 0)
            return presentValue;

        // Recursive Call
        return futureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) 
    {
        double presentValue = 10000;
        double growthRate = 0.20;   // 20%
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f", years, result);
    }
}
