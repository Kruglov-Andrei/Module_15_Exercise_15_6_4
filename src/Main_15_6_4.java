/*Создайте текстовый файл с таким содержимым:
1
12
123
1234
12345
123456
1234567
12345678
123456789
Теперь запишите содержимое этого файла в другой файл со строками,
записанными в обратном порядке.*/

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main_15_6_4 {
    public static void main(String[] args) throws Exception{
        Path path = Paths.get("C:\\Users\\Пользователь\\IDEA-SkillFactory projects\\Module_15_Exercise_15_6_4\\task.txt");// берем существующий файл
        List<String> contents = Files.readAllLines(path);// читаем в лист в память программы
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\Пользователь\\IDEA-SkillFactory projects\\Module_15_Exercise_15_6_4\\task-reversed"))) { // пишем в новый файл
            for (int index = contents.size() - 1; index >= 0; index--) { // создаем цикл с обратным порядком
                writer.write(contents.get(index));
                writer.write("\n"); // не забываем про перенос строки
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

