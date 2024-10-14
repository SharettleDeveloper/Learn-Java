package JavaElement.File;
import java.io.FileWriter;
import java.io.IOException;

public class file0 {
    public static void main(String[] args){
        String fileName = "./example.txt";
        String content  = "Hello, Javaファイル操作";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
            System.out.println("ファイルに書き込みました:" + fileName);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
