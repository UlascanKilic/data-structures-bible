package main.codersbyte.hardproblems.KnightJumps;

import java.util.Scanner;

public class KnightJumps {
    public static int KnightJumpsFunc(String str) {
        int[] moves = new int[]{-1,2,1,2,-1,-2,1,-2,-2,1,-2,-1,2,1,2,-1};
        int moveCount = 0;
        int x = Integer.parseInt(String.valueOf(str.charAt(1)));
        int y = Integer.parseInt(String.valueOf(str.charAt(3)));

        for(int i = 0; i < moves.length;i+=2){
            if (x + moves[i] <= 8 && y + moves[i+1] <= 8
                    && x + moves[i] > 0 && y + moves[i+1] > 0) { moveCount++;}
        }
        return moveCount;
    }
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(KnightJumpsFunc(s.nextLine()));
    }
}
