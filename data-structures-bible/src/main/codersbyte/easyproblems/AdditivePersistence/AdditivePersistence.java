package main.codersbyte.easyproblems.AdditivePersistence;

import java.util.Scanner;

public class AdditivePersistence {
    public static int AdditivePersistenceFunc(int num) {
        int attempt = 0;
        if(num < 10) {return attempt;}

        while(num > 9){
            num = Calculate(num);
            attempt++;
        }
        return attempt;
    }
    public static int Calculate(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(AdditivePersistenceFunc(Integer.parseInt(s.nextLine())));
    }
}
