import java.io.*;
import java.util.ArrayList;

public class InFile {

    private ArrayList<Student> list = new ArrayList<>();

    public ArrayList<Student> toArrayListFromFile() {

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("D:\\Программирование\\FileProject\\students.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        String[] temp = new String[3];
        int i = 0;
        try {
            while ((line = reader.readLine()) != null) {
                String[] arr = line.split(" ");
                switch (arr[0]) {
                    case "Lastname:":
                        temp[0] = arr[1].trim();
                        break;
                    case "Firstname:":
                        temp[1] = arr[1].trim();
                        break;
                    case "Age:":
                        temp[2] = arr[1].trim();
                        break;
                }
                i++;
                if (i == 3) {
                    Student student = new Student(temp[0], temp[1], temp[2]);
                    list.add(student);
                    i = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
