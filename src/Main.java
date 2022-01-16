import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu



           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}

        try {
            int[] tablica = new int[6];
            Scanner scan = new Scanner(System.in);
            boolean isIndexCorrect = false;
            int ktory;

            for (int i = 0; i < 6; i++) {
                tablica[i] = i * 10;
            }
            while (!isIndexCorrect) {
                ktory = scan.nextInt();
                if (ktory >= 0 && ktory <= 6) {
                    isIndexCorrect = true;
                    System.out.print(tablica[ktory]);
                }
            }
        }
        catch (Exception e)
        {
            System.out.print("\n Niedozwolony znak!");
        }
        finally
        {
            System.out.print("\nProgram zostal zakonczony");
        }



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,


        String test = null;
        System.out.print(test.length());

        System.out.print(5/0);

         */
        System.out.print("Podaj swój wiek");
        Scanner scan2 = new Scanner(System.in);

        int pin = scan2.nextInt();

        try
        {
            if(pin<10000)
            {
                System.out.print("Twoj pin jest za krótki!");
            }
            else if(pin>99999)
            {
                System.out.print("Twoj pin jest za dlugi!");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.print("Twoj pin nie jest liczbą!");
        }
        catch (Exception e)
        {
            System.out.print("Wystąpił problem z Twoim kodem pin");
        }
        finally
        {
            System.out.print("Operacja ustawiania pinu została zakończona.");
        }





    }
}
