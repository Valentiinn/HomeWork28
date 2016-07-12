import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        InFile inFile = new InFile();

        arr = inFile.toArrayListFromFile();
        OutFile outFile = new OutFile(arr);
        try {
            outFile.toFileFromArrayList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
