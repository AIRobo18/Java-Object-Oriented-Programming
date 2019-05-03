/**
 * Service class with supporting methods for Magic Trick
 *
 * @author Robert Aroutiounian
 * @version 10/30/2013
 */

import java.util.*;

public class MagicTrick
{
    private int[][] grid;
    private int flippedRow;
    private int flippedCol;
    public static final int GRID_SIZE = 6;

    /**
     * default constructor,
     * sets elements in the grid to randomly generated either 0 or 1
     * calls setParity method
     */
    public MagicTrick()
    {
        Random num = new Random();

        this.grid = new int [GRID_SIZE][GRID_SIZE];
        for (int r = 0; r < (this.grid.length - 1); r++)
        {
            for (int c = 0; c < (this.grid[r].length - 1); c++)
            {
                this.grid[r][c] = num.nextInt(2);
            }
        }
        setParity();
    }
    
     /**
     * sets elements in the last row and the last column
     * to either 1 or 0, so the sum of the elements in the appropriate row and column is even
     *
     */
    public void setParity()
    {
        for (int r = 0; r < (this.grid.length - 1); r++)
        {
            int total = 0;
            for (int c = 0; c < (this.grid[r].length - 1); c++)
            {
                total += this.grid[r][c];
            }
            if (total%2 != 0)
            {
                this.grid[r][this.grid[r].length - 1] = 1;
            }
        }

        for (int c = 0; c < (GRID_SIZE); c++)
        {
            int total = 0;
            for (int r = 0; r < (this.grid.length - 1); r++)
            {
                total += this.grid[r][c];
            }
            if (total%2 != 0)
            {
                this.grid[GRID_SIZE - 1][c] = 1;
            }
        }
    }

     /**
     * flips the value of the randomly
     * selected element
     */
    public void flipOneElement()
    {
        Random elementR = new Random();
        Random elementC = new Random();

        this.flippedRow = elementR.nextInt(GRID_SIZE);
        this.flippedCol = elementC.nextInt(GRID_SIZE);
        if (this.grid[this.flippedRow][this.flippedCol] == 0)
        {
            this.grid[this.flippedRow][this.flippedCol] = 1;
        }
        else
        {
            this.grid[this.flippedRow][this.flippedCol] = 0;
        }
    }

    /**
     * accessor method
     * @return  the value of the row of the flipped element: this.flippedRow
     */
    public int getFlippedRow()
    {
        return this.flippedRow; // THIS IS A STUB
    }

    /**
     * accessor method
     * @return  the value of the column of the flipped element: this.flippedCol
     */
    public int getFlippedColumn()
    {
        return this.flippedCol; // THIS IS A STUB
    }

    /**
     * toString method returns printable version
     * of the content of this.grid
     */
    public String toString()
    {
        String returnValue = "";
        for (int r = 0; r < GRID_SIZE; r++)
        {
            for (int c = 0; c < GRID_SIZE; c++)
            {
                returnValue += this.grid[r][c] + " ";
            }
            returnValue += "\n";
        }
        return returnValue += "\n";
    }




    /**
     * scheck the users guess
     * 
     * @param r - the row selected by the user
     * @param c - the column selected by the user
     * @return - true if the guessed row and column are the same
     *                as the row and column of the flipped element
     */
    public boolean checkGuess(int r, int c)
    {
        boolean check = false;
        if (r == this.flippedRow && c == this.flippedCol)
        {
            check = true;
        }
        return check;  // THIS IS A STUB
    }
}