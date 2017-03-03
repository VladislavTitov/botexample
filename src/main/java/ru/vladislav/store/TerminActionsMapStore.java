package ru.vladislav.store;

import ru.vladislav.models.Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TerminActionsMapStore {

    //TODO populate map
    public static HashMap<String, List<Action>> map = new HashMap<>();

    public static void initMap(){

        List<Action> deposit = new ArrayList<>();
        deposit.add(new Action("открыть", "Вы сказали открыть", "www.akbars.ru"));
        deposit.add(new Action("закрыть", "Вы сказали закрыть", "www.akbars.ru"));
        /*List<Action> credit;
        List<Action> course;
        List<Action> money;
        List<Action> account;
        List<Action> balance;*/

        map.put("вклад", deposit);

    }

}
