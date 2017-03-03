package ru.vladislav;

import ru.vladislav.models.AbstractAction;
import ru.vladislav.models.Action;
import ru.vladislav.store.TerminActionsMapStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QueryParser {

    ArrayList<Action> parseQuery(String query){
        ArrayList<Action> result = new ArrayList<>();
        HashMap<String, List<Action>> map = TerminActionsMapStore.map;


        for (String key:map.keySet()) {
            if(query.contains(key)){
                ArrayList<Action> actionsList = (ArrayList<Action>) map.get(key);

                for (Action action: actionsList) {
                    if (query.contains(action.getTitle())){
                        result.add(action);
                    }
                }
            }
        }

        return result;
    }

    

}
