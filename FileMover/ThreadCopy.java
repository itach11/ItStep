package Directories;

import java.io.IOException;

public class ThreadCopy extends Thread
{
    private volatile boolean running = true;
    private CopyManager copyManager;

    public ThreadCopy(CopyManager copyManager){
        this.copyManager=copyManager;
    }

    @Override
    public void run() {

        while (running) {
            if (!copyManager.isEmpty())
            {
                try {
                    copyManager.moveFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(10000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void powerOff(){
        this.running=false;
    }

}
