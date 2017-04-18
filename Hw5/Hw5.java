//Iris Osegueda 

import javax.swing.*;

public class Hw5
{

    public static void main(String[] args)
    {
	    int digits;
        int size;
        final int QUIT = -99;
        int[] intArray;

        digits = Integer.parseInt(JOptionPane.showInputDialog("Enter a number and find out if it's a palindrome! Or enter " + QUIT + " to quit."));

        while ( digits != QUIT)
        {
            size = getSize( digits );

            intArray = new int[size];

            fillArray( digits, intArray );

            if ( isPalindrome(intArray) )
            {
                JOptionPane.showMessageDialog( null, digits + " IS a palindrome!" );
            }

            else
            {
                JOptionPane.showMessageDialog( null, digits + " is NOT a palindrome!" );
            }


            digits = Integer.parseInt(JOptionPane.showInputDialog("Enter a number and find out if it's a palindrome! Or enter " + QUIT + " to quit."));

        }

        System.exit ( 0 );

    }

    public static int getSize( int num )
    {
        int count = 0;
        while ( num > 0 )
        {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void fillArray( int num, int[] intArray )
    {
        int length = intArray.length;
        int remainder;

        for ( int i = 0; i < length; i++ )
        {
            remainder = num%10;
            intArray[i] = remainder;
            num = num/10;
        }
    }

    public static boolean isPalindrome( int[] intArray )
    {
        int length = intArray.length;
        for ( int i = 0; i < ( length/2 ); i++)
        {
            if ( intArray[i] != intArray[length-1-i] )
            {
                return false;
            }
        }
        return true;
    }
}
