import java.io.Console;
import java.util.Scanner;

public class Cappelluti
{
    public static boolean ActiveBool = true;
    static Scanner sc = new Scanner(System.in);
    public static final String AnsiReset = "\u001B[0m";
    public static final String AnsiRedBackground = "\u001B[41m";

    public static void main(String[] args)
    {
        int Option;
        while (ActiveBool)
        {
            System.out.println("Inserire esercizio.\n1: Uno\n2: Due");
            Option = Integer.parseInt(sc.nextLine());
            switch (Option)
            {
                case 1:
                {
                    ExerciseOne();
                    ActiveBool = false;
                    break;
                }
                case 2:
                {
                    ReversePrint();
                    ActiveBool = false;
                    break;
                }
                default:
                    System.out.println(AnsiRedBackground + "Opziona invalida. Riprova." + AnsiReset);
            }
        }
    }

    public static void ExerciseOne()
    {
        int Even = 0;
        int Odd = 0;
        System.out.println("Inserire quanti numeri contiene array");
        int[] NumberArray = new int[ Integer.parseInt(sc.nextLine()) ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            System.out.println("Inserire numero " + (i + 1));
            NumberArray[ i ] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < NumberArray.length; i++)
        {
            if (NumberArray[ i ] % 2 == 0)
            {
                Even += NumberArray[ i ];
            }
            else
            {
                Odd += NumberArray[ i ];
            }
        }
        System.out.println("Somma Numeri Pari: " + Even + "\n" + "Somma Numeri Dispari: " + Odd);
    }

    public static void ReversePrint()
    {
        System.out.println("Inserire quanti numeri contiene array");
        int[] NumberArray = new int[ Integer.parseInt(sc.nextLine()) ];
        for (int i = 0; i < NumberArray.length; i++)
        {
            System.out.println("Inserire numero " + (i + 1));
            NumberArray[ i ] = Integer.parseInt(sc.nextLine());
        }
        for (int i = NumberArray.length - 1; i >= 0; i--)
        {
            System.out.println("Reverse: " + NumberArray[ i ]);
        }
    }
}