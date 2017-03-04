package ru.vladislav.nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Dmitry on 04.03.2017.
 */
public class DictionaryList {
    private static final List<String> queryDictionary = new ArrayList<String>() {
        {
            add("карт");
            add("открыть");
            add("получить");
            add("кредит");
            add("выплата");
            add("курс");
            add("кабинет");
            add("йти");
            add("онлайн");
            add("регистр");
            add("вклад");
            add("страхов");
            add("завещан");
            add("перевод");
            add("перевести");
            add("филиал");
            add("акци");
            add("посмотреть");
            add("золот");
            add("серебр");
            add("бронз");
            add("металл");
        }
    };

    private static final List<String> answers = new ArrayList<String>() {{
        add("Информация о картах здесь: https://www.akbars.ru/individuals/card/");
        add("Найти нужную карту: https://www.akbars.ru/individuals/card/service-selection/");
        add("Актуальный курс: https://www.akbars.ru/individuals/exchange/");
        add("Зайти или зарегистрироваться в личном кабинете: https://online.akbars.ru/wb/#login");
        add("Информация по переводам: https://www.akbars.ru/individuals/transfers/");
        add("Местоположения филиалов: https://www.akbars.ru/about/general/branches/");
        add("Информация об акциях: https://www.akbars.ru/all-action/arhiv/");
        add("Информация о тарифах: https://www.akbars.ru/banks/correspondent/rates/");
        add("Информация о кредитах: https://www.akbars.ru/corporate/credits/");
        add("Кредиты для малого бизнеса: https://www.akbars.ru/corporate/credits/small-business/");
        add("Варианты кредитов: https://www.akbars.ru/individuals/credits/consume/");
        add("Зарегистрироваться в личном кабинете: https://online.akbars.ru/wb/#enrollment");
        add("Информация по вкладам: https://www.akbars.ru/individuals/deposits/");
        add("Страхование вкладов: https://www.akbars.ru/individuals/deposits/insurance/");
        add("Завещание вкладов: https://www.akbars.ru/individuals/deposits/will-deposit/");
        add("Информация о драгоценных металлах: https://www.akbars.ru/banks/gold/");
    }};

    public static List<String> getQueryDictionary() {
        return queryDictionary;
    }

    public static List<String> getAnswers() {
        return answers;
    }
}
