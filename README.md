import java.util.*;
public class AverageMaxNumbers {

	  /**
     * @param args
     */
    public static void main(String[] args) 
    {
        
        
        Scanner keyboard = new Scanner(System.in);
        
        int number;    //for storing user input
        
        int sentinelValue = 0; //sentinel value
        
        int counter = 0;    // counter
        
        int total = 0;    // to store total numbers
        
        double num1; //stores first for max
        double num2; //stores second number for maxNum
        double num3; //stores third number
        
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
            System.out.println();
            
            for (int dash = 0; dash<10; dash++)
            	System.out.print("-");
            System.out.println();
            System.out.println();
            do
            {
            	System.out.println ("Enter the first number: ");
            
            
            	num1 = keyboard.nextDouble();
            	keyboard.nextLine();
            
            }while (num1<1);
            
            
            do
            {
            	System.out.println ("Enter the second number: ");
            	num2 = keyboard.nextDouble();
            	keyboard.nextLine();
            }while(num2<1);
            do
            {
            	System.out.println ("Enter the third number: ");
            	num3 = keyboard.nextDouble();
            	keyboard.nextLine();
            }while(num3<1);
            
            double maxValue;
            
            System.out.println();
            
            for (int dash = 0; dash<10; dash++)
            	System.out.print("-");
           System.out.println();
           System.out.println();
           maxValue = maxValue(num1, num2, num3);
        	System.out.println("The highest number you entered is " + maxValue + ".");
    }  
    /**New method to return Max Value of the three numbers
        @param n1 Holds num1 value
        @param n2 Holds num2 value
        @param n3 Holds num3 value
        @return Returns max Value of the three inputs
        */
        public static double maxValue(double n1, double n2, double n3)
        {
        	double maxValue;
        	
        	if (n1>n2 && n1>n3)
        		maxValue = n1;
        	else if (n2>n1 && n2>n3)
        		maxValue = n2;
        	else
        		maxValue = n3;
        	return maxValue;
            
        } 

    }
