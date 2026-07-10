/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.questions;

import com.ltq.pojo.Category;
import com.ltq.pojo.Level;
import com.ltq.pojo.Question;
import com.ltq.pojo.QuestionQueryBuilder;
import com.ltq.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuestionServices extends QuestionServicesBase {
    private QuestionQueryBuilder query;

    public QuestionServices() {
    }

    public QuestionServices(QuestionQueryBuilder query) {
        this.query = query;
    }
    
    @Override
    public List<Question> getQuestions() throws SQLException {
        PreparedStatement stm = this.query.build();
        
        ResultSet rs = stm.executeQuery();
        
        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");

            questions.add(new Question.Builder().setContent(content).setId(id).build());
        }
        
        return questions;
    }

    /**
     * @param query the query to set
     */
    public void setQuery(QuestionQueryBuilder query) {
        this.query = query;
    }
}
