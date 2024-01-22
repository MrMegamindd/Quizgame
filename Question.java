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
     * Constructs a new Question object with the given prompt and answer.
     * 
     * @param prompt the question prompt
     * @param answer the answer to the question
     */
public class Question {
    String question;
    String answer;
    public Question(String prompt, String answer) {
        this.question = prompt;
        this.answer = answer;
    }
}
