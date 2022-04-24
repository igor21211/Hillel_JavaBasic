package JustCodingForEnjoy;

import java.io.FileWriter;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args)  {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.close();
            fileWriter.write("text");
        } catch (IOException e){
            System.err.println("Запись невозможна из-за закрытого потока");
        }finally {
            System.out.println("Этот блок выполнится всегда!");
        }
        System.out.println("Это работа программы после блока try catch");
    }
}
