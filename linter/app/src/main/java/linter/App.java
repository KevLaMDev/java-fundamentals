/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(linter());

    }

    public static String linter() {
        Scanner scanner = null;
        Path filePath = Paths.get("C:\\Users\\Kevin LaMarca\\Documents\\401 Java\\java-fundamentals\\linter\\app\\src\\gates.js");
        try {
            scanner = new Scanner(filePath);
        } catch(IOException err) {
            System.err.println("invalid file path");
        }
//        HashMap<String,Boolean> errorLineMap = new HashMap<>();
        String returnMsg = "";
        int counter = 1;
        while(scanner.hasNextLine()) {
            String currentLine = scanner.nextLine();
            System.out.println(currentLine);
            if (currentLine != " ") {
                if (!currentLine.endsWith("}") || !currentLine.contains("if") || !currentLine.contains("else") || !currentLine.contains("{")) {
                    if (returnMsg.length() == 0) returnMsg += "Line " + counter + ": Missing semicolon.";
                    else returnMsg += "\nLine " + counter + ": Missing semicolon.";
                }
            }
            counter++;
        }
        return returnMsg;
    }
    // use scanner to parse through js file
    // return a concated string "Line X: Missing semicolon."
    // use while loop to keep reading over the file while scanner.hasNextLine
        // declare currentline var to scanner.nextLine()
        // if the line is empty
        // if the line ends w/ }
        // if the line contains if/else
            // DONT concat string
    // return the string
}