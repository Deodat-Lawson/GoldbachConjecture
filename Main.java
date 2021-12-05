import java.util.*;

public class Main {

    static boolean[] prime;
    public static void main(String[] args) {
	// write your code here
        sieveOfEratosthenes(10000000);
        Goldbach_Conjecture(27890);
    }

    public static void sieveOfEratosthenes(int N){

        prime = new boolean[N+1];
        int[] smallestPrimeFactor = new int[N+1];

        for (int i = 0; i < smallestPrimeFactor.length; i++) {
            smallestPrimeFactor[i] = i;
        }

        for (int i = 2; i < (int)(Math.sqrt(N+1)+1); i++) {
            if(smallestPrimeFactor[i] == i){
                for (int j = i*i; j <= N; j+=i) {
                    smallestPrimeFactor[j] = i;
                }
            }
        }

        for (int i = 2; i <= N; i++) {
            if(smallestPrimeFactor[i] == i){
                prime[i] = true;
            }
        }

    }

    public static void Goldbach_Conjecture(int num){
        for (int i = 3; i <= num/2; i++) {
            if(prime[i] && prime[num-i]){
                System.out.println(i +" "+ (num-i));
                return;
            }
        }
        }
    }

