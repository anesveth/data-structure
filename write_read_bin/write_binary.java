import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
 
public class write_binary {
    public static void main(String args[]) throws java.io.IOException {
        FileOutputStream fos = new FileOutputStream("data.bin");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        BufferedWriter out = new BufferedWriter(osw);
        String text = "puto el que lo lea\n\naver encuerate";
        out.write(text);
        out.flush();
        fos.close();
    }
}


 