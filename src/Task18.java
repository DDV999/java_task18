import java.io.*;

public class Task18 {
    public static void main(String[] args){
        int linesCount = 0;
        final String FILENAME = "src/file.txt";
        String str;
        System.out.println("Текущие данные в файле: ");
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))){
            while ((str = br.readLine()) != null){
                System.out.println(str);
                linesCount++;
            }
        } catch (IOException ex){
            System.out.println("Ошибка ввода-вывода: "+ex.getMessage());
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите построчно новые данные в файл: ");
        try (FileWriter fw = new FileWriter(FILENAME)){
            for (int i = 0; i < linesCount ; i++) {
                System.out.printf("(введите данные для строки №%d: ",i+1);
                str = br.readLine();
                str +="\r\n";
                fw.write(str);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
