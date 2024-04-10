package com.shubham.virtualmachine;
import java.io.FileWriter;
import java.io.IOException;

public class HelloDistributedSystems {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file name as an argument.");
            System.exit(1);
        }
        String fileName = args[0];
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.write("Hello Distributed Systems World!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

