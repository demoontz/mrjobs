package org.demoon.mrjobs.view;


import org.demoon.mrjobs.model.entity.Answer;
import org.demoon.mrjobs.model.entity.Question;
import org.demoon.mrjobs.model.entity.Questionnaire;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


@ManagedBean(name = "questionnaireService", eager = true)
@ApplicationScoped
public class QuestionnaireService {

    public static final String Q_NAME_TEMPLATE = "Test case 'BlaBlaBlaTest";

    public List<Questionnaire> getAvailableQuestionnaires() {
        List<Questionnaire> questionnaires = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            Questionnaire questionnaire = new Questionnaire();
            questionnaire.setId(i);
            questionnaire.setName(Q_NAME_TEMPLATE + i);
            questionnaires.add(questionnaire);
        }
        return questionnaires;
    }

    public List<Question> getQuestionList(int questionnaireId) {
        List<Question> questions = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            Question question;
            question = new Question();
            question.setId(i);
            question.setText(Q_NAME_TEMPLATE + questionnaireId + "', question " + i);
            List<Answer> answers = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                Answer answer = new Answer();
                answer.setId(j);
                answer.setText("Answer " + j);
                answers.add(answer);
            }
            question.setAvailableAnswers(answers);
            questions.add(question);
        }
        return questions;
    }
}
