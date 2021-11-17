import Lambda.ComparatorLambda;
import Lambda.FileLambda;
import Lambda.NewPattern;
import Lambda.RunnableLambda;

import java.io.File;
import java.io.FileFilter;

public class FirstLambda {

    public static void main(String[] args) throws InterruptedException {

        FileLambda fileLambda = new FileLambda();
        fileLambda.fileFilter();

        RunnableLambda runnableLambda = new RunnableLambda();
        runnableLambda.runLambda();

        ComparatorLambda comparatorLambda = new ComparatorLambda();
        comparatorLambda.compare();

        NewPattern newPattern = new NewPattern();
        newPattern.newPatternExample();

    }


}


