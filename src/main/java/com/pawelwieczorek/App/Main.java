package com.pawelwieczorek.App;

import com.pawelwieczorek.SenteceReader.FileSentenceReader;
import com.pawelwieczorek.Sentence.IReadable;
import com.pawelwieczorek.Sentence.Sentence;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static IReadable<Sentence> readable;

    public static void main(String[] args) throws FileNotFoundException {
        readable = new FileSentenceReader("/home/pawel/Projects/IntelliJ Projects/Sentence/src/main/resources/small.in");

        Sentence sentence;
        List<Sentence> sentenceArrayList = new ArrayList<>();

        do {
            sentence = readable.read();
            Sentence.sort(sentence);
            sentenceArrayList.add(sentence);
        } while(!sentence.isEmpty());



        System.out.println(sentenceArrayList);
    }
}
