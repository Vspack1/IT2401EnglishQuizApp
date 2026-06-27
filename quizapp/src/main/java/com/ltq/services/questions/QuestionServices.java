/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.questions;

import com.ltq.pojo.Category;
import com.ltq.pojo.Question;
import com.ltq.utils.MyConnectionSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class QuestionServices {
    public List<Question> getQuestions() throws SQLException{
        //B2 -> Mo ket noi
        Connection conn = MyConnectionSingleton.getInstance().connect();

        //B3 -> Thuc thi truy van
        String sql = "SELECT * FROM question";
        PreparedStatement stm = conn.prepareCall(sql);
        ResultSet rs = stm.executeQuery();
        
        List<Question> questions = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String content = rs.getString("content");

            questions.add(new Question.Builder().setContent(content).setId(id).build());
        }
        return questions;
    }
}
