/**
 * Created by Robert Aroutiounian on 2/25/2015.
 */

import java.util.Scanner;

public class CreditCard
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final String CARD_FORMAT = "[0-9]{8}";
        String card;

        String answer;
        do
        {
            do
            {
                System.out.print("Please enter your credit card number > ");
                card = scan.next();

            } while (!(card.matches(CARD_FORMAT)));

            int cardNumber = 0;
            int sum = 0;
            int sum2 = 0;
            for (int i = 0; i < 8; i++)
            {
                cardNumber = Character.digit(card.charAt(i), 10);

                if (!(cardNumber/2 == 0))
                {
                    sum += cardNumber;
                }

                int cardNumber1 = 0;
                int cardNumber2 = 0;
                if (cardNumber/2 == 0)
                {
                    cardNumber = cardNumber*2;
                    cardNumber1 = cardNumber/10;
                    cardNumber2 = cardNumber%10;
                    sum2 = cardNumber1 + cardNumber2;
                }
            }

            int totSum = sum + sum2;
            if (totSum%10 == 0)
            {
                System.out.println("The card sum is " + totSum + ", and this is a valid number.");
            }
            else
            {
                System.out.println("The card sum is " + totSum + ", and this is an invalid number.");
            }

            System.out.print("Check another card (y/n)? > ");
            answer = scan.next();

        }while (answer.equalsIgnoreCase("y"));

        System.out.println("Thank you, have a nice day.");
    }
}