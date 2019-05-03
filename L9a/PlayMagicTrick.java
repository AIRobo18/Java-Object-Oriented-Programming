/**
 * Client that plays Magic Trick
 *
 * @author Robert Aroutiounian
 * @version 10/30/2013
 */

import java.util.*;

public class PlayMagicTrick
{
    public static void main(String[] args)
    {
        // create a MagicTrick object
        MagicTrick magic = new MagicTrick();
        
        // print the content of the grid
        System.out.print("The grid is:\n" + magic.toString());
        
        // flip the value of the randomly selected element
        magic.flipOneElement();
        
        // ask the user for the guess
        Scanner scan = new Scanner(System.in);
        System.out.print("Can you guess which element I flipped?\n" + magic.toString());
        System.out.println("What is your guess?\nrow (0 - " + (MagicTrick.GRID_SIZE - 1) + ") :");
        int r = scan.nextInt();
        System.out.println("column(0 - " + (MagicTrick.GRID_SIZE - 1) + ") :");
        int c = scan.nextInt();
        
        // check user's guess
        if (magic.checkGuess(r, c))
            System.out.println("Congratulations, you guessed correctly!!!");
        else
            System.out.println("Sorry the correct guess is row:" + magic.getFlippedRow()
                    + " column:" + magic.getFlippedColumn());
    }
}
