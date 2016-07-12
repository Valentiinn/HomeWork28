import java.io.*;
import java.util.List;

public class OutFile {
    private List<Student> arr;

    public OutFile(List<Student> array) {
        this.arr = array;
    }


    public void toFileFromArrayList() throws IOException {
        FileWriter fileWriter = new FileWriter("D:\\Программирование\\FileProject\\students.xml");
        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.write("<students>");
        writer.newLine();
        for (Student student : arr) {
            writer.write("\t<student>");
            writer.newLine();
            writer.write("\t\t<lastname>" + student.getLastname() + "</lastname>");
            writer.newLine();
            writer.write("\t\t<firstname>" + student.getFirstname() + "</firstname>");
            writer.newLine();
            writer.write("\t\t<age>" + student.getAge() + "</age>");
            writer.newLine();
            writer.write("\t</student>");
            writer.newLine();
            writer.newLine();
        }
        writer.write("</students>");

        writer.close();
    }
}
