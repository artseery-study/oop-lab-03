import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dictionary {
    public Dictionary() throws InvalidFileFormatException, FileReadException {
        readDictionary();
    }

    private void readDictionary() throws InvalidFileFormatException, FileReadException {
        try(BufferedReader br = new BufferedReader(new FileReader("dictionary.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new FileReadException("Не удалось прочитать словарь", e);
        }
    }
}