/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ltq.pojo;

/**
 *
 * @author DELL
 */
public class Choice {
    private int id;
    private String content;
    private boolean correct;

    public Choice() {//Constructor
    }

    public Choice(int id, String content, boolean correct) {//Constructor have id, tai du lieu len database
        this.id = id;
        this.content = content;
        this.correct = correct;
    }
    
    public Choice(String content, boolean correct) {//Constructor without id, chen du lieu tu app xuong database
        this.id = id;
        this.content = content;
        this.correct = correct;
    }
}
