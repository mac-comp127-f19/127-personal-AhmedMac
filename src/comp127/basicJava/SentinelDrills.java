package comp127.basicJava;

import java.util.Scanner;

public class SentinelDrills {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        int userInt = 0;
        while (!(userInt < 0)) {
            System.out.println("Enter a number : ");
            userInt = scan.nextInt();
            int userNum = userInt;

            int cnt = 0;
            while (userNum != 1){
                userNum /= 2;
                cnt++;
            }
        }
    }
}
