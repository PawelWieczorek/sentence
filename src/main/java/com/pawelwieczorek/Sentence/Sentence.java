package com.pawelwieczorek.Sentence;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class Sentence extends ArrayList<String> {
    public static void sort(Sentence sentence){
        Collator collator = Collator.getInstance();
        collator.setStrength(Collator.PRIMARY);

        Collections.sort(sentence, collator);
    }

}