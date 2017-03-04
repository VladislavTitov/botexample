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
        deposit.add(new Action("открыть", "Вы сказали открыть вклад", "www.akbars.ru"));
        deposit.add(new Action("закрыть", "Вы сказали закрыть вклад", "www.akbars.ru"));
        List<Action> credit = new ArrayList<>();
        credit.add(new Action("взять", "Вы сказали взять кредит", "www.akbars.ru"));
        credit.add(new Action("оплатить", "Вы сказали оплатить кредит", "www.akbars.ru"));
        List<Action> course = new ArrayList<>();
        course.add(new Action("посмотреть", "Вы сказали посмотреть курс", "www.akbars.ru"));
        course.add(new Action("показать", "Вы сказали показать курс", "www.akbars.ru"));
        List<Action> money = new ArrayList<>();
        money.add(new Action("снять", "Вы сказали снять деньги", "www.akbars.ru"));
        money.add(new Action("положить", "Вы сказали положить деньги", "www.akbars.ru"));
        List<Action> account = new ArrayList<>();
        account.add(new Action("посмотреть", "Вы сказали посмотреть счет", "www.akbars.ru"));
        account.add(new Action("открыть", "Вы сказали открыть счет", "www.akbars.ru"));
        account.add(new Action("закрыть", "Вы сказали закрыть счет", "www.akbars.ru"));
        List<Action> balance = new ArrayList<>();
        balance.add(new Action("посмотреть", "Вы сказали посмотреть баланс", "www.akbars.ru"));

        map.put("вклад", deposit);
        map.put("кредит", credit);
        map.put("курс", course);
        map.put("деньг", money);
        map.put("курс", account);
        map.put("баланс", balance);

    }

}
