package org.demoon.mrjobs.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by demoon on 10/19/2015.
 */
public class TestResult1 {

    final static private HashMap<Integer, HashMap<Integer, ArrayList<String>>> db = new HashMap<>();

    public TestResult1() {
        init_db();
    }

    private void init_db() {
        db.clear();
        db.put(0, new HashMap<>());
        db.put(1, new HashMap<>());
        db.get(0).put(0, new ArrayList<String>(Arrays.asList("=")));
        db.get(0).put(1, new ArrayList<String>(Arrays.asList("Менеджер по туризму", "Бариста-Бармен", "Гид-экскурсовод", "Горничная", "Инспектор по кадрам", "Медсестра ", "Полицейский", "Официант", "Продавец-консультант", "Социальный работник", "Фельдшер", "Няня", "Администратор отеля", "Пожарный", "Нотариус", "Спасатель")));
        db.get(0).put(2, new ArrayList<String>(Arrays.asList("Машинист электропоезда","Летчик","Авиамеханик","Автоспециалист","Авиаспециалист","Инженер-энергетик","Электрик","Водитель","Машинист","Механик","Наладчик систем","Оператор станков с ЧПУ","Ремонтник","Слесарь","Столяр","Швея","Оптик")));
        db.get(0).put(3, new ArrayList<String>(Arrays.asList("Администратор баз данных","Системный администратор","Математик","Логист","Аудитор","Робототехник"," Риэлтор","Программист","Тестировщик ПО","Мастер по ремонту компьютерной техники","Технический архитектор","Авиадиспетчер","Менеджер по качеству","Технолог швейного производства")));
        db.get(0).put(4, new ArrayList<String>(Arrays.asList("Артист","Дизайнер одежды (модельер)","Работник сцены","Парикмахер-стилист","Визажист","Портной","Стилист","Ювелир")));
        db.get(0).put(5, new ArrayList<String>(Arrays.asList("Ландшафтный дизайнер","Флорист","Фармацевт")));

        db.get(1).put(0, new ArrayList<String>(Arrays.asList("=")));
        db.get(1).put(1, new ArrayList<String>(Arrays.asList("Менеджер по продажам","PR-менеджер","Менеджер по персоналу","Врач","Менеджер","Методист (воспитатель) по дошкольному воспитанию","Преподаватель","Психолог","Персональный ассистент","Тренер","Учитель","Юрисконсульт","Адвокат","Менеджер по туризму")));
        db.get(1).put(2, new ArrayList<String>(Arrays.asList("Инженеры","Испытатель двигателей","Контролер","Технолог","Конструктор")));
        db.get(1).put(3, new ArrayList<String>(Arrays.asList("Политолог","Менеджер по рекламе","Бухгалтер","Геодезист","Дефектоскопист","Редактор","Ученый-математик","Рентгенолог","Социолог","Технолог","Маркетолог","Бизнес-аналитик","Финансовый аналитик","Системный аналитик","Топограф","Менеджер по закупкам","Экономист")));
        db.get(1).put(4, new ArrayList<String>(Arrays.asList("Актер театра и кино","Журналист","Копирайтер","Архитектор","Художник","Музыкант","Хореограф"," Дизайнер","Сценарист","Фотограф","Стилист")));
        db.get(1).put(5, new ArrayList<String>(Arrays.asList("Фермер","Астроном","Физик","Химик","Биолог","Геолог","Агроном","Ветеринар")));

    }

    public Map<Integer, ArrayList<String>> getResult(HashMap<Integer, Integer> hm) {
        Map<Integer, ArrayList<String>> s = new HashMap<>();
        s.put(1, db.get(hm.get(1)).get(hm.get(0)));
        s.put(2, db.get(hm.get(3)).get(hm.get(2)));
        return s;
    }
}
