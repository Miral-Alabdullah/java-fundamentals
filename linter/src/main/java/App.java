import java.io.*;
import java.util.*;
import java.nio.file.*;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        Path file = Paths.get("src/main/gates.js");
        readingFromJsFils(file);
    }

    public static String readingFromJsFils(Path file) {
        String erroroMessage = "";
        int lineTracker = 0;
        try {
            List<String> fileLines = Files.readAllLines(file);
            lineTracker++;
            for (int i = 0; i < fileLines.size(); i++) {
                if (!fileLines.get(i).endsWith(";") && !(fileLines.get(i).isEmpty()
                        || fileLines.get(i).endsWith("{") || fileLines.get(i).endsWith("}")
                        || fileLines.get(i).contains("if") || fileLines.get(i).contains("else"))){
                    erroroMessage = "Line " + lineTracker + " : Missing semicolon.";
                }
            }
        } catch (IOException exception){
            System.out.println("An error occurred while reading from file");
        }
        return erroroMessage;
    }
}
