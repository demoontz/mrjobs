package org.demoon.mrjobs.view;

import java.util.*;

/**
 * Created by demoon on 10/19/2015.
 */
public class TestResult3 {

    final static private HashMap<Integer, HashMap<Integer, ArrayList<Integer>>> db  = new HashMap<>();
    final static private HashMap<Integer, ArrayList<Integer>>                   db2 = new HashMap<>();

    final static private HashMap<Integer, Integer> dbr0 = new HashMap<>();
    final static private HashMap<Integer, Integer> dbr1 = new HashMap<>();

    public TestResult3() {
        init_db();
    }

    private void init_db() {
        db.clear();
        db.put(1, new HashMap<Integer, ArrayList<Integer>>());
        db.put(2, new HashMap<Integer, ArrayList<Integer>>());
        db.put(3, new HashMap<Integer, ArrayList<Integer>>());
        db.put(4, new HashMap<Integer, ArrayList<Integer>>());
        db.put(5, new HashMap<Integer, ArrayList<Integer>>());
        db.put(6, new HashMap<Integer, ArrayList<Integer>>());
        db.put(7, new HashMap<Integer, ArrayList<Integer>>());

        db.get(1).put(0, new ArrayList<Integer>(Arrays.asList(15, 42)));
        db.get(1).put(1, new ArrayList<Integer>(Arrays.asList(1, 8, 17, 22, 28, 31, 36)));
        db.get(2).put(0, new ArrayList<Integer>(Arrays.asList(2, 7, 19, 23, 26, 33, 41)));
        db.get(2).put(1, new ArrayList<Integer>(Arrays.asList(11, 37)));
        db.get(3).put(0, new ArrayList<Integer>(Arrays.asList(5, 9, 32)));
        db.get(3).put(1, new ArrayList<Integer>(Arrays.asList(12, 20, 25, 29, 38, 43)));
        db.get(4).put(0, new ArrayList<Integer>(Arrays.asList(6, 10, 13, 16, 24, 34, 39)));
        db.get(4).put(1, new ArrayList<Integer>(Arrays.asList(30, 44)));
        db.get(5).put(0, new ArrayList<Integer>(Arrays.asList(16, 18, 43)));
        db.get(5).put(1, new ArrayList<Integer>(Arrays.asList(2, 11, 25, 35, 36, 45)));
        db.get(6).put(0, new ArrayList<Integer>(Arrays.asList(34)));
        db.get(6).put(1, new ArrayList<Integer>(Arrays.asList(4, 12, 14, 21, 27, 31, 40, 46)));
        db.get(7).put(0, new ArrayList<Integer>(Arrays.asList(3, 5, 6, 7, 9, 10, 13, 15, 16, 18, 19, 23, 24, 26, 32, 33, 34, 39, 41, 42)));
        db.get(7).put(1, new ArrayList<Integer>(Arrays.asList(1, 2, 4, 8, 11, 12, 14, 17, 20, 21, 22, 25, 27, 28, 29, 30, 31, 35, 36, 37, 38, 40, 43, 44, 45, 46)));


        db2.clear();
        db2.put(1, new ArrayList<Integer>(Arrays.asList(3, 6)));
        db2.put(2, new ArrayList<Integer>(Arrays.asList(3, 6)));
        db2.put(3, new ArrayList<Integer>(Arrays.asList(4, 7)));
        db2.put(4, new ArrayList<Integer>(Arrays.asList(3, 6)));
        db2.put(5, new ArrayList<Integer>(Arrays.asList(4, 7)));
        db2.put(6, new ArrayList<Integer>(Arrays.asList(3, 6)));
        db2.put(7, new ArrayList<Integer>(Arrays.asList(23, 32)));
        makeDb();
    }

    private void makeDb() {
        dbr0.clear();
        dbr1.clear();

        for (int i = 1; i < 8; i++) {
            for (Integer ans : db.get(0).get(i)) {
                dbr0.put(i, ans);
            }
            for (Integer ans : db.get(1).get(i)) {
                dbr1.put(i, ans);
            }

        }

    }

    public List<String> getResult(HashMap<Integer, Integer> hm) {
        List<String> result = new ArrayList<>();
        int r[] = {0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < 7; i++) {
            result.add(null);
        }


        for (Map.Entry entry : hm.entrySet()) {

            if ((int) entry.getValue() < 2) {
                r[(dbr0.get(entry.getKey()))]++;

            } else {
                r[(dbr1.get(entry.getKey()))]++;
            }


        }
        for (int i = 0; i < 7; i++) {
            result.add(Integer.toString(r[i]));
        }

        return result;

    }
}
