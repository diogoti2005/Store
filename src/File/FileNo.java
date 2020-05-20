package File.outPutFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileNo {

    Path file1 = Paths.get("newinputFile2.txt");
    Path file2 = Paths.get("newOutPutFile.txt");
    try{
        Files.createFile(file1);
        Files.createFile(file2);
     Files.copy(file1,file2)
    }catch (IOException e){

    }finally{}
}
