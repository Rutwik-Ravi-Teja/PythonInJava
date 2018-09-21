package pycall;

import java.io.*;
import java.util.Arrays;

public class Python {

    /**
     * 
     * @param args
     * 
     */
    public static void main(String[] args){
        try{
            String pythonPath = "C:\\users\\user\\desktop\\ml\\java.py";
            //String pythonExe = "C:/Users/AppData/Local/Continuum/Anaconda/python.exe";
            ProcessBuilder pb = new ProcessBuilder(Arrays.asList("C:\\Users\\User\\AppData\\Local\\Programs\\Python\\Python36-32\\python", pythonPath));
            Process p = pb.start();

            BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = "";
//            System.out.println("Running Python starts: " + line);
            int exitCode = p.waitFor();
//            System.out.println("Exit Code : "+exitCode);
//            line = bfr.readLine();
//            System.out.println("First Line: " + line);
              while ((line = bfr.readLine()) != null){
                System.out.println(line);


            }

        }catch(Exception e){System.out.println(e);}
    }

}