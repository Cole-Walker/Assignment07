package com.mycompany.assignment07_2;

// Tower of Hanoi with 4 pegs

public class Assignment07_2
{
    public static int count=0;
    public static void main(String[] args)
    {
        towerOfHanoi(7, "A", "B", "C", "D");
        System.out.println("No of steps : " + count);
    }

    static void towerOfHanoi(int numOfDisks, String from, String to, String helper1, String helper2)
    {
        if (numOfDisks == 0)
        {
            return;
        }
        if (numOfDisks == 1)
        {
            System.out.println("Move the disc " + numOfDisks + " from " + from + " to " + to);
            count++;
            return;
        }

        towerOfHanoi(numOfDisks-2, from, helper1, helper2, to);
        System.out.println("Move the disc " + (numOfDisks-1) +" from " + from + " to "+ helper2 );
        System.out.println("Move the disc " + numOfDisks +" from " + from +" to " + to);
        System.out.println("Move the disc " + (numOfDisks-1) +" from " + helper2 +" to " + to);
        count +=3;

        towerOfHanoi(numOfDisks-2, helper1, to, from, helper2);
    }
}
