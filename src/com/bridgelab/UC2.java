package com.bridgelab;

import java.util.Scanner;

public class UC2 {
    public static void main(String[] args)
    {
        char[] board;
        String start;
        Scanner s1=new Scanner(System.in);
        board=new char[10];
        start="X";
        String winner=null;
        for(int i=0;i<10;i++)
        {
            //String s = String.valueOf(i + 1);
            // board[i]=String.valueOf(i+1);
            board[i]= Character.valueOf((char) (i+1));
        }
        System.out.println("Welcome to winner");
        System.out.println(board);
        while (winner==null)
        {

        }
    }
}
