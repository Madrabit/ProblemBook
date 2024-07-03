package ru.madrabit.leonard.chapter1;


/*
*  Программа, которая инвертирует слова
* */
public class WordInverter {

    public String invert(String word) {
        StringBuilder builder = new StringBuilder(word);
        return builder.reverse().toString();
    }

}
