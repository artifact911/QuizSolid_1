import service.Dialog;
import service.Exam;
import service.IParser;
import service.ParserWord;
import service.ParserWordReverse;
import service.Shuffler;
import service.Storage;

import java.io.IOException;

public class Program {

    public static void main(String[] args) throws IOException {
    //   BufferedReader reader = new BufferedReader(new InputStreamReader(Program.class.getResourceAsStream("words.csv")));

        IParser parser = new ParserWord();
        //IParser parserWordReverse = new ParserWordReverse();
        Storage storage = new Storage("/words.csv", parser);
        Shuffler shuffler = new Shuffler(storage);
        Dialog dialog = new Dialog();
        Exam exam = new Exam(dialog, shuffler);
        exam.start(3);
    }
}
