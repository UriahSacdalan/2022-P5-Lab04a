// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 100 Point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;

        double numMonths = numYears*12;
        double actualRate = annualRate/100;
        double monthlyRate = actualRate/12;

        double topParenth = Math.pow(1 + monthlyRate, numMonths);
        double numerator = monthlyRate * topParenth;
        double denominator = topParenth - 1;

        double monthlyPay = principal*(numerator/denominator);
        monthlyPay *= 100;
        monthlyPay = Math.round(monthlyPay);
        monthlyPay /= 100;

        double totalPay = (monthlyPay*numMonths);
        double totalInt = totalPay-principal;

        System.out.println("Principal:         $" + principal);
        System.out.println("Annual Rate:       " + annualRate + "%");
        System.out.println("Number of Years:   " + numYears);
        System.out.println("Monthly Payment:   $" + monthlyPay);
        System.out.println("Total Payments:    $" + totalPay);
        System.out.println("Total Interest:    $" + totalInt);

    }
}

