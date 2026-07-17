/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.questions;

import com.ltq.pojo.Question;
import com.ltq.pojo.QuestionQueryBuilder;
import com.ltq.services.QueryServicesBase;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class QuestionServices extends QueryServicesBase<Question> implements QuestionServicesBase {

    private QuestionQueryBuilder query;

    public QuestionServices() {

    }

    @Override
    public PreparedStatement getStm() throws SQLException {
        return this.query.build();
    }

    @Override
    public Question getObject(ResultSet rs) throws SQLException {
        return new Question.Builder().setContent(rs.getString("content")).setId(rs.getInt("id")).build();

    }

    /**
     * @param query the query to set
     */
    public void setQuery(QuestionQueryBuilder query) {
        this.query = query;
    }
}
