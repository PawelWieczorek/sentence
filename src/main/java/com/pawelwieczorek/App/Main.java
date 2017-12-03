package com.pawelwieczorek.App;

import com.pawelwieczorek.Sentence.Sentence;

public class Main {

    public static void main(String[] args) {
        Sentence sentence = new Sentence();
        sentence.add("ABC");
        sentence.add("Xyz");
        sentence.add("def");
        sentence.add("świnia");

        Sentence.sort(sentence);

        System.out.println(sentence);
    }
}
