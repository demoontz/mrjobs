package org.demoon.mrjobs.view;

import org.demoon.mrjobs.model.entity.Question;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.util.List;

@ManagedBean
@SessionScoped
public class TestCase {

    @ManagedProperty("#{questionnaireService}")
    private QuestionnaireService questionnaireService;

    private int            questionnaireId;
    private List<Question> questions;

    public void setQuestionnaireService(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    public int getQuestionnaireId() {
        return questionnaireId;
    }

    public void setQuestionnaireId(int questionnaireId) {
        this.questionnaireId = questionnaireId;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public String startTestCase() {
        questions = questionnaireService.getQuestionList(questionnaireId);
        return "/pages/test-case-page.xhtml";
    }

    public String submitAnswers() {
        return "/pages/test-result-page.xhtml";
    }

}
