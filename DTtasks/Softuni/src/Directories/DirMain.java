package Directories;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class DirMain {
    private static final String sourceFolder = "/home/golex/test";
    private static final String destination = "/home/golex/test/Destination";

    public static void main(String[] args) throws IOException {
        CopyManager copyManager = new CopyManager(sourceFolder, destination);

        ThreadCopy copyThread = new ThreadCopy(copyManager);

        copyThread.start();

        System.out.println("Press any key to stop ...");
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();

        copyThread.powerOff();



    }


}
