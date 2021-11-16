package Lambda;

import java.io.File;
import java.io.FileFilter;

public class FileLambda {

    public void fileFilter(){

        FileFilter fileFilter = (File pathname) ->
                pathname.getName().endsWith(".java");

        int count = 0;
        File dir = new File("C:/Users/Kamal/Desktop/Java");
        File[] files = dir.listFiles(fileFilter);

        for(File f: files){
            System.out.println(f);
            count++;
        }

        System.out.println(count);
    }

}
