package day2;

import java.util.Scanner;

public class primeNumber {
    public static void main (String [] args){
    Scanner in = new Scanner(System.in);
    int n1 = in.nextInt();
    System.out.println(isPrime(n1));
    }

    static boolean isPrime(int n){
        boolean isNotPrime=false;
        for(int i = 2; i<n;i++){
if(n%i==0){
    isNotPrime=true;
}

        }
        return isNotPrime;
    }
}
