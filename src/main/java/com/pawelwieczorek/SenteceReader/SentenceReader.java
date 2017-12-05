package com.pawelwieczorek.SenteceReader;

import com.pawelwieczorek.Sentence.IReadable;
import com.pawelwieczorek.Sentence.Sentence;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class SentenceReader implements IReadable<Sentence>{
    protected Scanner sc;

}
