import java.util.ArrayList;
import java.util.Scanner;

public class Sieve {

    public static int[] Pool;

    public static int[] fillTable(int Length){
        Pool = new int[Length-1];
        for (int i = 0; i < Pool.length; i++){
            Pool[i] = i+2;
        }
    return Pool;}

    public static ArrayList<Integer> Primes(int[] Pool){

        ArrayList<Integer> Primes = new ArrayList<>();
        int Checker;
        for (int i = 0; i < Pool.length; i++) {
            if(Pool[i] != 0){
                Checker = Pool[i];
                for( int y = Checker; y < Pool.length; y++){
                    if (Pool[y] % Checker == 0){
                        Pool[y] = 0;
                    }
                }
                Primes.add(Checker);
            }
        }
    return Primes;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Choose a Length for the Prime Number Pool: ");
        for (Object X : Primes(fillTable(input.nextInt()))) {
            System.out.println(X);
        }

    }
}
