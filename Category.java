/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizgame;

/**
 *
 * @author Ahmed
 */
/**
     * Constructs a new Category object with the specified name and questions.
     *
     * @param name      the name of the category
     * @param questions an array of questions in the category
     */
public class Category {
   String name;
    Question[] questions;
    public Category(String name, Question[] questions) {
        this.name = name;
        this.questions = questions;
    } 
}
