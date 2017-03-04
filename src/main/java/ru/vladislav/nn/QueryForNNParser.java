package ru.vladislav.nn;

import java.util.ArrayList;

/**
 * Created by Dmitry on 04.03.2017.
 */
public class QueryForNNParser {

    public static double[] parse(String query) {
        ArrayList<String> dictionary = DictionaryList.getDictionary();
        int capacity = dictionary.size();

        double[] result = new double[capacity];

        for (int i = 0; i < capacity; i++) {
            if(query.contains(dictionary.get(i))){
                result[i] = 1;
            }
        }
        return result;
    }
}
