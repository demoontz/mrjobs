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

        db.get(0).put(1, new ArrayList<String>(Arrays.asList("������", "��������")));
        db.get(0).put(2, new ArrayList<String>(Arrays.asList("����������� �� ��������", "����������")));
        db.get(0).put(3, new ArrayList<String>(Arrays.asList("����������", "������")));
        db.get(0).put(4, new ArrayList<String>(Arrays.asList("������", "������")));
        db.get(0).put(5, new ArrayList<String>(Arrays.asList("������� ����", "�����������")));

        db.get(1).put(1, new ArrayList<String>(Arrays.asList("����", "���������")));
        db.get(1).put(2, new ArrayList<String>(Arrays.asList("��������", "���������� ����������")));
        db.get(1).put(3, new ArrayList<String>(Arrays.asList("����������", "��������")));
        db.get(1).put(4, new ArrayList<String>(Arrays.asList("����������", "��������")));
        db.get(1).put(5, new ArrayList<String>(Arrays.asList("�����", "�����")));

    }

    public Map<Integer, ArrayList<String>> getResult(HashMap<Integer, Integer> hm) {
        Map<Integer, ArrayList<String>> s = new HashMap<>();
        s.put(1, db.get(hm.get(2)).get(hm.get(1)));
        s.put(2, db.get(hm.get(4)).get(hm.get(2)));
        return s;
    }
}
