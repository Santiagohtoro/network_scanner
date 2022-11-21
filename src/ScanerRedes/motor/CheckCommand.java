package ScanerRedes.motor;

import ScanerRedes.Objects.Command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckCommand extends Command {

    File script = new File("C:\\Users\\Santiago\\Downloads\\checkping.cmd");

    public CheckCommand(String name, String commandLine) {
        super(name, commandLine);
    }


    public CheckCommand() {
        super();
    }

    public void FileFound() throws FileNotFoundException, ZeroBytesException {
        if (!script.exists()) {
            throw new FileNotFoundException("File Not Found");
        }
        if (script.length() == 0) {
            throw new ZeroBytesException("File is empty");
        }
    }

    public int Launch(String address){
        int retryInterval = -1;
        ProcessBuilder processBuilder =new ProcessBuilder();
        try {
            FileFound();
            processBuilder.command("C:\\Users\\Santiago\\Downloads\\checkping.cmd",address);
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println(fileNotFoundException.getMessage());
        }catch (ZeroBytesException zeroBytesException){
            System.out.println(zeroBytesException.getMessage());
        }
        try {
            Process process = processBuilder.start();
            retryInterval =process.waitFor();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return retryInterval;
    }

}
