import java.util.*;

public class BinomialCoefficient {

    // Function to calculate factorial no
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to calculate nCr
    public static int binomialCoeff(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nrFact = factorial(n - r);

        int result = nFact / (rFact * nrFact);
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int ans = binomialCoeff(n, r);
        System.out.println("Binomial Coefficient (nCr) = " + ans);
    }
}

//this is a code about binomial Coefficient calculation

