package org.demoon.mrjobs.view;


import org.demoon.mrjobs.model.entity.Question;
import org.demoon.mrjobs.model.entity.TestA;
import org.demoon.mrjobs.model.entity.TestGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by demoon on 10/19/2015.
 */
public class CalcTestResult {


    public Map<Integer, ArrayList<String>> calcTest1(TestGroup testGroup) {
        TestResult1 tr = new TestResult1();

        int r[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (TestA testA : testGroup.getTestAList()) {

            int i = 0;
            for (Question q : testA.getQuestion()) {
                if (q.getCurentAnsverId() != null) {
                    r[i] += q.getCurentAnsverId();
                }
                i++;
            }
        }


        HashMap<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            int r1max = i * 7;
            for (int j = 0; j < 4; j++) {
                if (r[r1max] < r[i * 7 + j + 1]) {
                    r1max = i * 7 + j + 1;
                }
            }
            result.put(i * 2, r1max - i * 7);

            if (r[5 + i * 7] < r[6 + i * 7]) {
                result.put(i * 2 + 1, 0);
            } else {
                result.put(i * 2 + 1, 1);
            }


        }
        return tr.getResult(result);
    }

    public HashMap<Integer, Integer> calcTest2(TestGroup testGroup) {


        return null;
    }

    public List<String> calcTest3(TestGroup testGroup) {
        HashMap<Integer, Integer> inData = new HashMap<>();
        TestResult3 tr = new TestResult3();


        for (Question q : testGroup.getTestAList().get(0).getQuestion()) {
            if (q.getCurentAnsverId() != null) {
                inData.put(q.getId().intValue()-199, q.getCurentAnsverId().intValue());
            }
        }


        return tr.getResult(inData);
    }
}
