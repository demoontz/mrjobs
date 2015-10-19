package org.demoon.mrjobs.view;

import org.demoon.mrjobs.model.entity.Question;
import org.demoon.mrjobs.model.entity.TestA;
import org.demoon.mrjobs.model.entity.TestGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by demoon on 10/19/2015.
 */
public class CalcTestResult {
    public Map<Integer,ArrayList<String>> calcTestResult(TestGroup testGroup) {

        if (testGroup.getId() == 1) {
            TestResult1 tr=new TestResult1();
            return tr.getResult(calcTest1(testGroup));
        }

        return null;
    }

    private HashMap<Integer,Integer> calcTest1(TestGroup testGroup) {
        int r[] = {0, 0, 0, 0, 0, 0, 0};
        String res = "";
        for (TestA testA : testGroup.getTestAList()) {

            int i = 0;
            for (Question q : testA.getQuestion()) {
                r[i] += q.getCurentAnsverId();
                i++;
            }
        }
        int r1max = 0;
        HashMap<Integer, Integer> result=new HashMap<>();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if (r[r1max] < r[j + 1]) {
                    r1max = j + 1;
                }
            }
            result.put(i,r1max);
            if (r[5] > r[6]) {
                result.put(i+1,0);
            } else {
                result.put(i+1,1);
            }
        }
        return result;
    }


}