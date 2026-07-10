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
public abstract class QuestionServicesBase {
    public abstract List<Question> getQuestions() throws SQLException;
}
