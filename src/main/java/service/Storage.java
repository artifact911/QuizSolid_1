package service;

import model.Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Storage {

    private String fileName;

    private IParser parser;

    public Storage(String fileName, IParser parser) {
        this.fileName = fileName;
        this.parser = parser;
    }

    public List<Quiz> getList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(fileName)));
        List<Quiz> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(parser.getQuiz(reader.readLine()));
        }
        return list;
    }
}