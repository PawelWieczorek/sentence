package com.pawelwieczorek.SenteceReader;

import com.pawelwieczorek.Sentence.Sentence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class FileSentenceReader extends SentenceReader {

    public FileSentenceReader(String filePath) throws FileNotFoundException {

        File file = new File(filePath);
        sc = new Scanner(file);
    }

    public Sentence read() {
        String tempString = "";
        Sentence sentence = new Sentence();

            Pattern word = Pattern.compile(".*[^\\x21]");
            Pattern endWord = Pattern.compile(".*\\x21");

            while (sc.hasNext(word)) {
                tempString = sc.next(word);
                sentence.add(tempString);
            }

            if (sc.hasNext(endWord))
            {
                tempString = sc.next(endWord);
                sentence.add(tempString);
            }
            else
            {
                sentence.clear();
            }


        return sentence;
    }
}
