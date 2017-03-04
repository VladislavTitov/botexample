package ru.vladislav.nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dmitry on 04.03.2017.
 */
public class QueryForNNParser {

    double[] parse(String query) {
        List<String> dictionary = DictionaryList.getQueryDictionary();
        int capacity = dictionary.size();

        double[] result = new double[capacity];

        for (int i = 0; i < capacity; i++) {
            if (query.contains(dictionary.get(i))) {
                result[i] = 1;
            }
        }
        return result;
    }
}
