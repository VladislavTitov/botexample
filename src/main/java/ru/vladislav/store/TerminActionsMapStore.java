package ru.vladislav.store;

import ru.vladislav.models.Action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TerminActionsMapStore {

    //TODO populate map
    public static HashMap<String, List<Action>> map = new HashMap<>();

    public static void initMap() {

        List<Action> card = new ArrayList<>();
        card.add(new Action("открыт", "Информация о картах здесь: ", "https://www.akbars.ru/individuals/card/"));
        card.add(new Action("получить", "Информация о картах здесь: ", "https://www.akbars.ru/individuals/card/"));
        card.add(new Action("подобр","Подобрать карту можно здесь","https://www.akbars.ru/individuals/card/service-selection/"));

        List<Action> credit = new ArrayList<>();
        credit.add(new Action("", "Информация о кредитах для физических лиц здесь: ", "https://www.akbars.ru/individuals/credits/"));
        credit.add(new Action("получить", "Подобрать кредиты можно здесь: ", "https://www.akbars.ru/individuals/credits/consume/"));
        credit.add(new Action("подобрать", "Подобрать кредиты можно здесь: ", "https://www.akbars.ru/individuals/credits/consume/"));
        credit.add(new Action("средн","Кредиты для среднего бизнеса","https://www.akbars.ru/corporate/credits/"));
        credit.add(new Action("крупн","Кредиты для крупного бизнеса","https://www.akbars.ru/corporate/credits/"));
        credit.add(new Action("мал","Кредиты для малого бизнеса","https://www.akbars.ru/corporate/credits/small-business/"));

        List<Action> course = new ArrayList<>();
        course.add(new Action("", "Актуальный курс: ", "https://www.akbars.ru/individuals/exchange/"));

        List<Action> akBarsOnline = new ArrayList<>();
        akBarsOnline.add(new Action("йти", "Зайти в личный кабинет: ", "https://online.akbars.ru/wb/#login"));
        akBarsOnline.add(new Action("регистр", "Зарегистрироваться в личном кабинете: ", "https://online.akbars.ru/wb/#enrollment"));

        List<Action> contribution = new ArrayList<>();
        contribution.add(new Action("", "Информация по вкладам", "https://www.akbars.ru/individuals/deposits/"));
        contribution.add(new Action("страхов", "Страхование вкладов", "https://www.akbars.ru/individuals/deposits/insurance/"));
        contribution.add(new Action("завещ", "Завещание вкладов", "https://www.akbars.ru/individuals/deposits/will-deposit/"));

        List<Action> transfer = new ArrayList<Action>();
        transfer.add(new Action("", "Информация по переводам", "https://www.akbars.ru/individuals/transfers/"));

        List<Action> filial = new ArrayList<>();
        filial.add(new Action("где","местоположения филиалов","https://www.akbars.ru/about/general/branches/"));

        List<Action> stock = new ArrayList<>(); //акции типа
        stock.add(new Action("посмотреть","Информация об акциях","https://www.akbars.ru/all-action/arhiv/"));

        List<Action> preciouMetals = new ArrayList<>();
        preciouMetals.add(new Action("default","Информация о драгоценных металлах","https://www.akbars.ru/banks/gold/"));

        map.put("карт", card);
        map.put("кредит", credit);
        map.put("курс", course);
        map.put("кабинет", akBarsOnline);
        map.put("онлайн", akBarsOnline);
        map.put("вклад", contribution);
        map.put("перевод", transfer);
        map.put("перевести", transfer);
        map.put("филиал", filial);
        map.put("акци", stock);
        map.put("золот", preciouMetals);
        map.put("серебр", preciouMetals);
        map.put("бронз", preciouMetals);
        map.put("металл", preciouMetals);
    }
}
