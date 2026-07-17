/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.services;

import com.ltq.pojo.Category;
import com.ltq.utils.MyConnectionSingleton;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class CategoryServices extends QueryServicesBase<Category> {

    @Override
    public PreparedStatement getStm() throws SQLException {
        return MyConnectionSingleton.getInstance().connect().prepareCall("SELECT * FROM category");
    }

    @Override
    public Category getObject(ResultSet rs) throws SQLException {
        return new Category(rs.getInt("id"), rs.getString("name"));

    }
}
