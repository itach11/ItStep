package Directories;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayDeque;

public  class CopyManager {

    private File source;
    private File destination;
    private ArrayDeque<File> filesStack = new ArrayDeque<>();

    public CopyManager(String source,String destination)
    {
        this.source=new File(source);
        this.destination=new File(destination);

    }

    /*public void dirTolist(String sourcePath) {
        File dir = new File(sourcePath);
        File[] files = dir.listFiles();

        for (File f : files) {
            if (isEmpty(dir))
                break;

            if (!f.isDirectory()) {
                moveFile(String source ,String dest);
            }
        }

    }
    */
     boolean isEmpty() {
        boolean isEmpty = source.listFiles().length<=0;
        return isEmpty;
    }
     void  moveFile() throws IOException {
        for (File file : source.listFiles()) {
            filesStack.add(file);
        }

        File currentFile = null;

        Path sourcePath;
        Path destinationPath;

        while (!filesStack.isEmpty()) {

            currentFile = filesStack.pop();

            sourcePath = Paths.get(currentFile.getPath());
            destinationPath = Paths.get(destination.getPath() + File.separator + currentFile.getName());

            Files.move(sourcePath, destinationPath, StandardCopyOption.ATOMIC_MOVE);
        }
    }
}
