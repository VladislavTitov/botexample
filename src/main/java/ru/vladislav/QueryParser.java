package ru.vladislav;

import ru.vladislav.models.Action;
import ru.vladislav.store.TerminActionsMapStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QueryParser {

    public static ArrayList<Action> parseQuery(String query) {
        ArrayList<Action> result = new ArrayList<>();
        HashMap<String, List<Action>> map = TerminActionsMapStore.map;

        for (String key : map.keySet()) {
            if (query.contains(key)) {
                ArrayList<Action> actionsList = (ArrayList<Action>) map.get(key);

                int i = 0;
                for (Action action : actionsList) {
                    if (query.contains(action.getTitle())) {
                        result.add(action);
                        i++;
                    }
                }

                if (i == 0) {
                    result.addAll(actionsList);
                }

            }
        }
        if (result.size() < 1) {
            result.add(new Action("Некорректный запрос!",
                    "Я не смог распознать ваши слова, сформулируйте, пожалуйста, по-другому!",
                    ""));
        }

        return result;
    }
}