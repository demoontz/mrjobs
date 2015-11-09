package org.demoon.mrjobs.view;

import org.demoon.mrjobs.model.entity.Question;
import org.demoon.mrjobs.model.entity.TestA;
import org.demoon.mrjobs.model.entity.TestGroup;
import org.demoon.mrjobs.model.entity.User;
import org.demoon.mrjobs.persistence.service.TestGroupDAO;
import org.demoon.mrjobs.persistence.service.UserDAO;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by demoon on 22.09.2015.
 */
@ManagedBean(name = "testGroupBean")
@SessionScoped
public class TestGroupBean {

    @Inject
    private TestGroupDAO testGroupDAO;

    @Inject
    private UserDAO userDAO;


    private List<TestA>     listTestA;
    private List<TestGroup> listTestG;
    private TestA           testA;
    private TestGroup       testGroup;
    private Question        question;
    private User            user;
    private String          result;
    private int             testType;
    private List<String>    result1a;
    private List<String>    result1b;
    private List<String>    result2;
    private List<String>    result3;
    private int             age;
    private boolean tableVisible = true;

    @PostConstruct
    private void init() {
        System.out.println("init");
        listTestG = testGroupDAO.getAllOrderId();
        testGroup = listTestG.get(0);
        sortAll();
        testA = testGroup.getTestAList().get(0);
        question = testA.getQuestion().get(0);

    }

    //===M===
    private void sortAll() {

        Collections.sort(testGroup.getTestAList());
        for (TestA ta : testGroup.getTestAList()) {
            Collections.sort(ta.getQuestion());
        }
    }

    public String finishTest() {
        System.out.println("fin test");
        CalcTestResult c = new CalcTestResult();
        result = "";
        if (testType == 1) {
            Map<Integer, ArrayList<String>> testResult = c.calcTest1(testGroup);
            result1a = testResult.get(1);
            result1b = testResult.get(2);
        }
        if (testType == 2) {
            result2 = c.calcTest2(testGroup, 30);

        }
        if (testType == 3) {
            result3 = c.calcTest3(testGroup);
            ;
        }
        return "result" + testType;
    }


    public User getCurrentUser() {

        ExternalContext context = FacesContext.getCurrentInstance()
                                              .getExternalContext();
        String login = context.getUserPrincipal().getName();
        user = userDAO.findUserByLogin(login);
        return user;
    }

    public String goTest(int t) {
        System.out.println("ch test=" + t);
        testType = t;
        testGroup = listTestG.get(t - 1);
        sortAll();
        testA = testGroup.getTestAList().get(0);
        question = testA.getQuestion().get(0);
        return "test";
    }

    public void prevQ() {
        System.out.println("prev q");
        if (testA.getQuestion().indexOf(question) > 0) {
            question = testA.getQuestion().get(testA.getQuestion().indexOf(question) - 1);
        } else {
            if (testGroup.getTestAList().indexOf(testA) > 0) {
                testA = testGroup.getTestAList().get(testGroup.getTestAList().indexOf(testA) - 1);
                question = testA.getQuestion().get(testA.getQuestion().size() - 1);
            }

        }


    }

    public void nextQ() {
        System.out.println("next q");
        if (question.getId()==576)tableVisible = false;
        if ((testA.getQuestion().indexOf(question) + 1) < testA.getQuestion().size()) {
            question = testA.getQuestion().get(testA.getQuestion().indexOf(question) + 1);
        } else {
            if (testGroup.getTestAList().indexOf(testA) + 1 < testGroup.getTestAList().size()) {
                testA = testGroup.getTestAList().get(testGroup.getTestAList().indexOf(testA) + 1);
                question = testA.getQuestion().get(0);
            }

        }
    }

    //===gs===
    public User getUser() {

        if (user == null) {
            user = getCurrentUser();
        }
        if (user == null) {
            user = new User();
        }

        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<TestGroup> getListTestG() {
        return listTestG;
    }

    public void setListTestG(List<TestGroup> listTestG) {
        this.listTestG = listTestG;
    }

    public TestA getTestA() {
        return testA;
    }

    public void setTestA(TestA testA) {
        this.testA = testA;
    }

    public TestGroup getTestGroup() {
        return testGroup;
    }

    public void setTestGroup(TestGroup testGroup) {
        this.testGroup = testGroup;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getTestType() {
        return testType;
    }

    public void setTestType(int testType) {
        this.testType = testType;
    }

    public List<TestA> getListTestA() {
        return listTestA;
    }

    public void setListTestA(List<TestA> listTestA) {
        this.listTestA = listTestA;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public List<String> getResult1a() {
        return result1a;
    }

    public void setResult1a(List<String> result1a) {
        this.result1a = result1a;
    }

    public List<String> getResult1b() {
        return result1b;
    }

    public void setResult1b(List<String> result1b) {
        this.result1b = result1b;
    }

    public List<String> getResult3() {
        return result3;
    }

    public void setResult3(List<String> result3) {
        this.result3 = result3;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTableVisible() {
        return tableVisible;
    }

    public void setTableVisible(boolean tableVisible) {
        this.tableVisible = tableVisible;
    }

    public List<String> getResult2() {
        return result2;
    }

    public void setResult2(List<String> result2) {
        this.result2 = result2;
    }
}
