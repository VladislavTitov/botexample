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
        card.add(new Action("открыт", "Информация о картах здесь: ", "https://www.akbars.ru/individuals/card/debit_cards/#card=tab1"));
        card.add(new Action("получить", "Информация о картах здесь: ", "https://www.akbars.ru/individuals/card/debit_cards/#card=tab1"));
        card.add(new Action("подобр","Подобрать карту можно здесь","https://www.akbars.ru/individuals/card/service-selection/"));

        List<Action> credit = new ArrayList<>();
        credit.add(new Action("получить", "Информация о кредитах здесь: ", "https://www.akbars.ru/individuals/credits/"));
        credit.add(new Action("взять", "Информация о кредитах здесь: ", "https://www.akbars.ru/individuals/credits/"));
        credit.add(new Action("закрыт", "Информация о кредитах здесь: ", "https://www.akbars.ru/individuals/credits/"));
        credit.add(new Action("оплат", "Информация о кредитах здесь: ", "https://www.akbars.ru/individuals/credits/"));

        List<Action> course = new ArrayList<>();
        course.add(new Action("посмотреть", "Актуальный курс: ", "https://www.akbars.ru/individuals/exchange/"));
        course.add(new Action("показать", "Актуальный курс: ", "https://www.akbars.ru/individuals/exchange/"));

        List<Action> akBarsOnline = new ArrayList<>();
        akBarsOnline.add(new Action("зайти", "Зайти или зарегистрироваться в личном кабинете: ", "https://online.akbars.ru/wb/#login"));
        akBarsOnline.add(new Action("зарегистрировать", "Зайти или зарегистрироваться в личном кабинете: ", "https://online.akbars.ru/wb/#login"));

        List<Action> contribution = new ArrayList<>();
        contribution.add(new Action("открыть", "Информация по вкладам", "https://www.akbars.ru/individuals/deposits/"));
        contribution.add(new Action("закрыть", "Информация по вкладам", "https://www.akbars.ru/individuals/deposits/"));

        List<Action> transfer = new ArrayList<Action>();
        transfer.add(new Action("с карты", "Информация по переводам", "https://www.akbars.ru/individuals/transfers/"));
        transfer.add(new Action("на карту", "Информация по переводам", "https://www.akbars.ru/individuals/transfers/"));

        List<Action> filial = new ArrayList<>();
        filial.add(new Action("где","местоположения филиалов","https://www.akbars.ru/about/general/branches/"));

        List<Action> stock = new ArrayList<>(); //акции типа
        stock.add(new Action("посмотреть","Информация об акциях","https://www.akbars.ru/all-action/arhiv/"));

        List<Action> tariff = new ArrayList<>();
        tariff.add(new Action("посмотреть","Информация о тарифах","https://www.akbars.ru/banks/correspondent/rates/"));

        List<Action> busyness = new ArrayList<>();
        busyness.add(new Action("средн","Кредиты для среднего бизнеса","https://www.akbars.ru/corporate/credits/kreditnye_produkty/"));
        busyness.add(new Action("крупн","Кредиты для крупного бизнеса","https://www.akbars.ru/corporate/credits/kreditnye_produkty/"));
        busyness.add(new Action("мал","Кредиты для малого бизнеса","https://www.akbars.ru/corporate/credits/small-business/"));
        busyness.add(new Action("default","Общая информация","https://www.akbars.ru/corporate/"));

        List<Action> preciouMetals = new ArrayList<>();
        preciouMetals.add(new Action("default","Информация о драгоценных металлах","https://www.akbars.ru/banks/gold/"));

        map.put("карт", card);
        map.put("кредит", credit);
        map.put("курс", course);
        map.put("кабинет", akBarsOnline);
        map.put("вклад", contribution);
        map.put("перевод", transfer);
        map.put("перевести", transfer);
        map.put("филиал",filial);
        map.put("акци",stock);
        map.put("тариф",tariff);
        map.put("бизнес",busyness);
        map.put("золот",preciouMetals);
    }
}
