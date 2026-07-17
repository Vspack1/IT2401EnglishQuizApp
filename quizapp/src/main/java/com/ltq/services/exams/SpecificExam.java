/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.exams;

import com.ltq.pojo.Question;
import com.ltq.pojo.QuestionQueryBuilder;
import com.ltq.services.questions.QuestionFacade;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class SpecificExam implements ExamStrategy {

    private int num;

    public SpecificExam(int num) {
        this.num = num;
    }

    public SpecificExam(String num) {
        this(Integer.parseInt(num));
    }

    @Override
    public List<Question> getQuestions() throws SQLException {
        QuestionQueryBuilder q = new QuestionQueryBuilder().setLimit(this.num).setOrderBy("rand()");

        return QuestionFacade.getLazyQuestions(q);
    }

}
