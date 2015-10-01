package org.demoon.mrjobs.view;

import org.demoon.mrjobs.model.entity.PassTest;
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
import java.util.List;

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
    private User            user;
    private String          result;
    private int             testType;

    @PostConstruct
    private void init() {
        System.out.println("init");
        listTestG = testGroupDAO.getAll();
        testGroup = listTestG.get(0);

    }
    //===M===

    public String finishTest() {

        result = calcTestResult();
        user.getPassTestList().add(new PassTest(testGroup, result));
        userDAO.update(user);
        return "resultpage";
    }

    private String calcTestResult() {
//        for(TestA t: testGroup.getTestAList()){
//            Map<Integer,Integer> r=new HashMap<>();
//
//            int qresult=0;
//            for(Question q: t.getQuestion()){
//                qresult+=q.getAnswer();
//            }
//
//
//            r.get(t.getRule().getId().intValue());
//            r.add(t.getRule().getId().intValue(), (r.get(t.getRule().getId().intValue()))+t.get);
//
//
//        }
//        for (int i = 0; i < ; i++) {
//
//        }
        return null;
    }

    public User getCurrentUser() {

        ExternalContext context = FacesContext.getCurrentInstance()
                                              .getExternalContext();
        String login = context.getUserPrincipal().getName();
        user = userDAO.findUserByLogin(login);
        return user;
    }

    public void changeTest(int t) {
        System.out.println("ch test="+t);
        testType = t;
        testGroup = listTestG.get(t);

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
}
