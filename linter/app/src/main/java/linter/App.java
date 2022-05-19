/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String filePath = "app/src/main/resources/gates.js";
        System.out.println(linter(filePath));

    }

    public static String linter (String file){
        int lineNum = 0;
        // got from https://docs.oracle.com/javase/tutorial/java/data/buffers.html
        StringBuilder errorMessage = new StringBuilder();
        try {
            Path linterPath = Paths.get(file);
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));

            while(scanner.hasNextLine()){
                lineNum++;
                String line = scanner.nextLine();
                if (line.isEmpty() || line.endsWith("{") || line.endsWith("}") || line.endsWith(";") || line.contains("if") || line.contains("else")) {
                    continue;
                }

                else {
                    errorMessage.append("Line ").append(lineNum).append(": Missing semicolon.\n");
                }
            }
        }catch (IOException ioe){
            System.out.println(ioe + "Error Line" + lineNum);
        }
        if (errorMessage.length() == 0){
            errorMessage.append("File is empty!");
        }
        return errorMessage.toString();
    }

}