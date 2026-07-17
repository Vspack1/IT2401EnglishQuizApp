/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.exams;

import com.ltq.pojo.Question;
import com.ltq.pojo.QuestionQueryBuilder;
import com.ltq.services.questions.QuestionFacade;
import com.ltq.utils.Configs;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class FixedExam implements ExamStrategy {

    @Override
    public List<Question> getQuestions() throws SQLException {
        List<Question> questions = new ArrayList<>();

        for (int i = 0; i < Configs.RATES.length; i++) {
            QuestionQueryBuilder q = new QuestionQueryBuilder().withLevel(i + 1)
                    .setLimit((int) (Configs.RATES[i] * Configs.EXAM_NUM)).setOrderBy("rand()");
            questions.addAll(QuestionFacade.getLazyQuestions(q));
        }

        return questions;
    }

}
