import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        final double FREE_SHIP = 100;
        double totalCost = 0;
        double shippingCost = 0;
        final double SHIP_RATE = .02;
        String trash = "";

        System.out.print("Enter the item price: ");
        if(in.hasNextDouble())
        {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear the buffer

            if (itemPrice >= FREE_SHIP)
            {
                shippingCost = 0;
                totalCost = itemPrice;
            }
            else // item price < 100
            {
                shippingCost = itemPrice * SHIP_RATE;
                totalCost = itemPrice + shippingCost;

            }
            // Display results
            System.out.println("Shipping costs are: $" + shippingCost);
            System.out.println("Total costs are $" + totalCost);
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + "is not a valid number!");
            System.out.println("Run the program again with correct input!");
        }
        itemPrice = in.nextDouble();

    }
}