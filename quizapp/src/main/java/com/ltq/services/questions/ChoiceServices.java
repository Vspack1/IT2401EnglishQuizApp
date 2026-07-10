/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services.questions;

import com.ltq.pojo.Choice;
import com.ltq.pojo.Level;
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
public class ChoiceServices {
    public List<Choice> getChoicesByQuestionId(int questionId) throws SQLException {
         Connection conn = MyConnectionSingleton.getInstance().connect();

        // B3 -> Thuc thi truy van
        String sql = "SELECT * FROM choice WHERE question_id=?";
        PreparedStatement stm = conn.prepareCall(sql);
        stm.setInt(1, questionId);
        ResultSet rs = stm.executeQuery();
        
        List<Choice> choices = new ArrayList<>();
        while (rs.next()) {
            choices.add(new Choice(rs.getInt("id"), rs.getString("content"), rs.getBoolean("is_correct")));
        }
        
        return choices;
    }
}
