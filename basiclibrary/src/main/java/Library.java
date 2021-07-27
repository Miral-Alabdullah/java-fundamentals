
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    public static void main(String[] args) {
        System.out.println("\nStarting The Program\n");
        System.out.println("Hello"); // first test
        System.out.println("=====================================");
        roll(3);
        containsDuplicates(10);
        averageOfIntergers();
        arrayOfArrays();

    }

    public static void roll(int n){
        System.out.println("\nRoll Method\n");
        Random rand = new Random();
        ArrayList<Integer> arrayOfSides = new ArrayList<Integer>();
        int sidesOfDice;
        for (int i=0; i<n; i++){
            sidesOfDice = rand.nextInt(6);
            arrayOfSides.add(sidesOfDice);
        }
        System.out.print(arrayOfSides + "\n");
        System.out.println("=====================================");
    }

    public static void containsDuplicates (int n) {
        System.out.println("\ncontainsDuplicates Method\n");
        Random rand = new Random();
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
        int elements;
        for (int i=0; i<n; i++){
            elements = rand.nextInt(n);
            if(arrayOfNumbers.contains(elements)){
                System.out.print("Is " + elements + " duplicated? " + " true" + "\n");
            } else {
                System.out.print("Is " + elements + " duplicated? " + " false" + "\n");
            }
            arrayOfNumbers.add(elements);
        }
        System.out.print("\n" + arrayOfNumbers + "\n");
        System.out.println("=====================================");
    }

    public static void averageOfIntergers () {
        System.out.print("\n averageOfIntergers Method \n");

        int [] arrayOfIntegers = new int [10];
        double sum=0;
        double average=0;
        Random rand = new Random();
        int numbers;
        for (int i=0; i<arrayOfIntegers.length; i++){
            numbers = rand.nextInt(10);
            arrayOfIntegers[i]=numbers;
            sum+=numbers;

        }
        average=sum/10;
        System.out.println(" \n The Average of " + sum + "/10" + " = " + average);
        System.out.println("=====================================");
    }

    public static void arrayOfArrays() {
        System.out.print("\n arrayOfArrays \n");
        double sum=0;
        double average=0;
        int index = 0;
        double arrayOfAverages [] = new double [4];
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        System.out.println("\n The Averages are : " + "\n");
        for (int i=0; i<weeklyMonthTemperatures.length; i++){
            index=0;
            sum=0;
            for (int j=0; j<weeklyMonthTemperatures[i].length; j++){
                sum+=weeklyMonthTemperatures[i][j];
                index++;
            }
            average=sum/index;
            arrayOfAverages[i]=average;
            System.out.println("* " + arrayOfAverages[i] + "\t");
        }
        Arrays.sort(arrayOfAverages);
        System.out.println("\n The Lowest Average is: " + arrayOfAverages[0] + "\n");

    }
}


