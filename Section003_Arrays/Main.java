import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("How many days of data will be input?");

        int[] temperature = new int[s.nextInt()];
        int overallTemp = 0;

        for(int i = 0; i < temperature.length; i++){
            System.out.println("What temperature was it on day " + (i + 1));
            temperature[i] = s.nextInt();
            overallTemp += temperature[i];
        }

        int average = overallTemp / temperature.length;
        int count = 0;

        for(int i = 0; i < temperature.length; i++){
            if(temperature[i] > average){
                count++;
            }
        }
        
        System.out.println("Average temperature is " + average);

        System.out.println("Days above the average temperature were: " + count );

    }
}
