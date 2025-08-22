import java.util.Scanner;
/**
 * This application converts between various units of measurement.
 *
 * @author Alex Spuhler
 * @version 8/20/2025
 */
public class Conversions
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Feet to Meters");
        System.out.println("4. Meters to Feet");
        System.out.println("5. Ounces to Milliliters");
        System.out.println("6. Milliliters to Ounces");
        System.out.println("7. Meters to kiloMeters");
        System.out.println("8. Kilometers to meters");
        System.out.println("9. Roblox Studs to meters");
        System.out.println("10. Meters to roblox Studs");
        //Add 2 more conversions, each both ways, to add choices 7, 8, 9, and 10.
        //You can add even more if you would like.

        int selection = keyboard.nextInt();
        keyboard.nextLine();  //go past the endline and be ready for more input

        if (selection == 1)
        {
            System.out.println("Enter Celsius: ");
            double celsius = keyboard.nextDouble();
            keyboard.nextLine();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + " degrees celsius is " + fahrenheit + " degrees fahrenheit");
        }
        if (selection == 2) // converts fahrenheit to celcius
        {
            System.out.println("Enter fahrenheit: ");
            double fahrenheit = keyboard.nextDouble();
            keyboard.nextLine();
            double celcius = fahrenheit/ (9.0/5.0) - 32;
            System.out.println(fahrenheit + " degrees fahrenheit is " +  celcius + " degrees celcius");
        }

        if (selection == 3)  // converts feet to meters. 
        {
            System.out.println("Enter Feet: ");
            double feet = keyboard.nextDouble();
            keyboard.nextLine();
            double meters = feet * (0.304);
            System.out.println(feet + " feet is " + meters + " meters");
        }

        if (selection == 5)
        {
            System.out.println("Enter ounces: ");
            double ounces =  keyboard.nextDouble();
            keyboard.nextLine();
            double millimeters = ounces / (29.57);
            System.out.println(ounces + " ounces is " + millimeters + " millimeters");


        }

        if (selection == 4)
        {
            System.out.println("Enter meters: ");
            double meters =  keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters * (3.04);
            System.out.println(meters + " Meters is " + feet + " Feet");


        }

         if (selection == 6)
        {
            System.out.println("Enter millimeters: ");
            double meters =  keyboard.nextDouble();
            keyboard.nextLine();
            double feet = meters / (29.57);
            System.out.println(meters + " millimeters is " + feet + " ounces");
        }

        if (selection == 7)
        {
            System.out.println("Enter Meters: ");
            double meters =  keyboard.nextDouble();
            keyboard.nextLine();
            double kilometers = meters / (1000.00);
            System.out.println(meters + " meters " + kilometers + " kilometers");
        }

        if (selection == 8)
        {
            System.out.println("Enter KiloMeters: ");
            double kilometers =  keyboard.nextDouble();
            keyboard.nextLine();
            double meters = kilometers * (1000.00);
            System.out.println(kilometers + " kilometers " + meters + " kilometers");
        }

        if (selection == 9)
        {
            System.out.println("Enter Studs: ");
            double Studs =  keyboard.nextDouble();
            keyboard.nextLine();
            double meters = Studs * (0.28);
            System.out.println(Studs + " Studs " + meters + " Meters");
        }

         if (selection == 10)
        {
            System.out.println("Enter Meters: ");
            double meters =  keyboard.nextDouble();
            keyboard.nextLine();
            double studs  = meters / (0.28);
            System.out.println(meters + " Meters " + studs + " studs");
        }


        //add more if statements here.
    }
}