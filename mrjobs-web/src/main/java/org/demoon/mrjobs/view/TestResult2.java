package org.demoon.mrjobs.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by demoon on 10/19/2015.
 */
public class TestResult2 {

    final static private HashMap<Integer, ArrayList<Integer>> db = new HashMap<>();
    final static private HashMap<Integer, ArrayList<Integer>> db2 = new HashMap<>();
    public TestResult2() {
        init_db();
    }

    private void init_db() {
        db.clear();
        db.put(1, new ArrayList<Integer>(Arrays.asList(71, 75, 79, 83, 87, 91, 95, 99, 103, 107, 110, 115, 119, 123, 127, 131, 135, 138, 142, 146, 151)));
        db.put(2, new ArrayList<Integer>(Arrays.asList(70, 74, 78, 82, 86, 90, 94, 98, 102, 106, 110, 114, 117, 122, 125, 129, 133, 137, 141, 145, 150)));
        db.put(3, new ArrayList<Integer>(Arrays.asList(78, 81, 85, 89, 93, 96, 100, 104, 107, 111, 115, 119, 122, 126, 129, 133, 137, 140, 144, 148, 152)));
        db.put(4, new ArrayList<Integer>(Arrays.asList(79, 84, 89, 94, 99, 104, 109, 114, 119, 124, 129, 134, 138, 144, 149, 154, 159)));
        db.put(5, new ArrayList<Integer>(Arrays.asList(78, 82, 85, 88, 91, 94, 97, 100, 103, 107, 110, 113, 116, 119, 122, 125, 128, 131, 134, 138, 141)));
        db.put(6, new ArrayList<Integer>(Arrays.asList(78, 81, 85, 89, 93, 98, 100, 104, 107, 111, 115, 119, 122, 126, 129, 133, 137, 140, 144, 148, 152)));
        db.put(7, new ArrayList<Integer>(Arrays.asList(82, 85, 88, 92, 95, 98, 101, 104, 108, 111, 114, 117, 120, 124, 127, 130, 134, 137, 140, 143, 147)));
        db.put(8, new ArrayList<Integer>(Arrays.asList(74, 78, 82, 86, 89, 93, 95, 98, 101, 105, 108, 112, 115, 119, 122, 125, 129, 132, 135, 139, 142)));
        db.put(9, new ArrayList<Integer>(Arrays.asList(73, 77, 80, 84, 88, 91, 95, 98, 102, 105, 109, 112, 116, 120, 123, 126, 130, 133, 137, 141, 145)));
    }

    public ArrayList<String> getResult(int[] r) {
        ArrayList<String> s = new ArrayList<>();



        return s;
    }
}
