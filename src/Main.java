import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the problem:");
        int problem = sc.nextInt();
        //entering problems number to choose one
        if(problem == 1) {
            int n = sc.nextInt();
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = sc.nextInt();
            }
            Problem1 a = new Problem1(n, N);
            a.Problem_1(n, N);  //call func for each problem

        }
        if(problem == 2) {
            int n = sc.nextInt();
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {   //entering an array by user
                N[i] = sc.nextInt();
            }
            Problem2 a = new Problem2(n, N);
            a.FindAVG();
        }
        //just repeat it 10 times
        if(problem == 3) {
            int n = sc.nextInt();
            Problem3 a = new Problem3(n);
            System.out.println("Problem 3: "+a.isPrime(n));
        }
        if(problem == 4) {
            int n = sc.nextInt();
            Problem4 a = new Problem4();
            System.out.println("Problem 4: "+a.FindFact(n));
        }
        if(problem == 5) {
            int n = sc.nextInt();
            Problem5 a = new Problem5();
            System.out.println("Problem 5: "+a.FindFibon(n));
        }
        if(problem == 6) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Problem6 a = new Problem6();
            System.out.println("Problem 6: "+a.FindPowerOf(n,m));
        }
        if(problem == 7) {
            int n = sc.nextInt();
            int[] N = new int[n];
            for (int i = 0; i < n; i++) {
                N[i] = sc.nextInt();
            }
            Problem7 a = new Problem7();
            a.ReserseArray(N, n);
        }
        if(problem == 8) {
            String n = sc.nextLine();
            Problem8 a = new Problem8();
            System.out.println("Problem 8: "+a.isAllDigits(n));
        }
        if(problem == 9) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Problem9 a = new Problem9();
            System.out.println("Problem 9: "+a.FindBinomialCoeff(n,m));
        }
        if(problem == 10) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Problem10 a = new Problem10();
            System.out.println("Problem 10: "+a.FindGCD(n,m));
        }
        if(problem == 11){ //important one
            int n = sc.nextInt();
            Problem11 a = new Problem11();
            a.PrintHeartForBestTeacher(n);
        }

    }
}