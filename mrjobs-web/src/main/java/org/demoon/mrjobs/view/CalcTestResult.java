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


    public Map<Integer, ArrayList<String>> calcTest1(TestGroup testGroup) {
        TestResult1 tr = new TestResult1();

        int r[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int ii = 0;
        for (TestA testA : testGroup.getTestAList()) {


            for (Question q : testA.getQuestion()) {
                if (q.getCurentAnsverId() != null) {
                    r[ii] += q.getCurentAnsverId();
                }

            }ii++;
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

    public HashMap<Integer,ArrayList<? extends Object>> calcTest2(TestGroup testGroup, int age) {
        TestResult2 tr2 = new TestResult2();
        //calc raw data
        int r[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int i = 0;
        for (TestA testA : testGroup.getTestAList()) {

            for (Question q : testA.getQuestion()) {
                switch (q.getTypeQ().intValue()) {
                    case 1:
                        if (q.getCurentAnsverId() != null && q.getCurentAnsverId().equals(q.getTrueAnsver())) {

                            r[i]++;
                            if (i == 3)r[i]++;

                        }
                        break;
                    case 2:
                        if (q.getAnsverStr() != null && q.getAnsverStr().equals(q.getTrueAnsver())) {
                            r[i]++;
                            if (i == 3) {
                                r[i]++;
                            }
                        }

                        break;
                    case 4:
                        if (q.getAnsverStr() != null && q.getAnsverStr().equals(q.getTrueAnsver())) {
                            r[i]++;
                            if (i == 3) {
                                r[i]++;
                            }
                        }
                        break;
                }


            }
            i++;
        }
        //calc standart data
        return tr2.getResult(r);
    }

    public HashMap<String, Integer> calcTest3(TestGroup testGroup) {
        HashMap<Integer, Integer> inData = new HashMap<>();
        TestResult3 tr = new TestResult3();


        for (Question q : testGroup.getTestAList().get(0).getQuestion()) {
            if (q.getCurentAnsverId() != null) {
                inData.put(q.getId().intValue() - 199, q.getCurentAnsverId().intValue());
            }
        }


        return tr.getResult(inData);
    }
}
