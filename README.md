import java.util.Scanner;
public class AverageNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        Scanner keyboard = new Scanner(System.in);
       
        int number;    //for storing user input
       
        int sentinelValue = 0; //sentinel value
       
        int counter = 0;    // counter
       
        int total = 0;    // to store total numbers
   
        System.out.println ("Enter your numbers for averaging: ");
       
        number = keyboard.nextInt();
       
        while (number != 0)
        {
            counter++;
           
            total = total + number;
           
            System.out.println ("Enter your numbers for averaging: ");
           
            number = keyboard.nextInt();   
       
        }   
            double average = total/counter;
            System.out.println ("Your average for " + counter + " numbers, with a total of " + total +
                                " is " + average +".");
   
            /* New method for max value
             */
           
           
            System.out.println ("Enter three numbers: ");
           
           
            number = keyboard.nextInt();
           
            if (number<1)
            {
                System.out.println ("Invalid input")
       
                System.out.println ("Enter three numbers: ");
            }
            else
            {
               
            }
