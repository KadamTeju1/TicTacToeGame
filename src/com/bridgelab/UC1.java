package com.bridgelab;

import java.util.Scanner;

public class UC1 {
    public static void main(String[] args) {
        char board[] = new char[10];
        Scanner key = new Scanner(System.in);
        char a1 = ' ';
        char a2= ' ';
        char a3 = ' ';
        char b1 = ' ';
        char b2 = ' ';
        char b3 = ' ';
        char c1 = ' ';
        char c2=' ';
        char c3=' ';
        int start = 1;
        int y = 0;
        while (y <= 9) {
            if (start == 1)
            {
                System.out.println("Start of the first player");
                String input = key.nextLine();
                if (input.equals("left"))
                {
                    if (a1 == ' ') {
                        a1 = 'x';
                        start++;
                        y++;
                    } else
                    {
                        System.out.println("already taken");
                    }
                } else if (input.equals("top middle"))
                {
                    if(a2==' ')
                    {
                        a2='x';
                        start++;
                        y++;
                    }
                }
                else if (input.equals("top middle"))
                {
                    if(c1==' ')
                    {
                        c1='x';
                        start++;
                        y++;
                    }
                }
            }

        }


    }
}
