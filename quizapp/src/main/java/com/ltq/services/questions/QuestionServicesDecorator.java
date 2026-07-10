/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.questions;

import com.ltq.pojo.Question;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuestionServicesDecorator extends QuestionServicesBase {
    private QuestionServicesBase service;

    public QuestionServicesDecorator(QuestionServicesBase service) {
        this.service = service;
    }
    
    

    @Override
    public List<Question> getQuestions() throws SQLException {
        List<Question> questions = this.service.getQuestions();
        
        ChoiceServices c = new ChoiceServices();
        for (var q: questions)
            q.setChoices(c.getChoicesByQuestionId(q.getId()));
        
        return questions;
    }
    
    
}
