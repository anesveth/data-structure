import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class read_binary {
    public static void main(String [] pArgs) throws FileNotFoundException, IOException {
      File file = new File("/Users/anesveth/Documents/datastructure/data.bin");
      try (FileInputStream fileInputStream = new FileInputStream(file)) {
        int singleCharInt;
        char singleChar;
  
        while((singleCharInt = fileInputStream.read()) != -1) {
          singleChar = (char) singleCharInt;
          System.out.print(singleChar);
        }
      }
    }
  }