
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!"); //To kick the project off

        int dogCount = 1;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        
        clock();

    }


    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + 's';
        } else {
            if (number == 1) {
                return word;
            }
        }
        return word;
    }



//    public static double Random () {
//        return Math.random();
//    }
//
//    public static void flipNHeads (int n){
//
//        double randomFlips = Random();
//        if(randomFlips<=0.5){
//            System.out.println("heads");
//        } else {
//            System.out.println("tails");
//        }
//    }


    public static void clock() {
        LocalDateTime now = LocalDateTime.now();

        while (true) {
            LocalDateTime current = LocalDateTime.now();
            if (current.getSecond() != now.getSecond()) {
                now = current;
                String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.println(time);


            }

        }


    }
}