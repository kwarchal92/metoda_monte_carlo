package metoda_Monte_Carlo;

import static java.lang.Math.*;

public class NewClass {

    public static void main(String[] args)
    {
        int n = 9999999; //liczba punktow
        double x, y;
        int k = 0;

        for(int i = 1; i<= n; i++)
        {
            x = Math.random();
            y = Math.random();

            if (x * x + y * y <= 1)
                k++;
        }

        double pi = 4.0 * k / n;

        System.out.println("obliczona liczba pi = " + pi + ".");
        System.out.println("stala pi = " + PI + ".");
        System.out.println("roznica = " + abs(PI - pi) + ".");

    }
}
