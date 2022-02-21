package org.example;

import org.example.model.Word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(Program.class.getResourceAsStream("words.txt")));
        List<Word> list = new ArrayList<>();


        while (reader.ready()){
            System.out.println(reader.readLine());
        }
    }
}
