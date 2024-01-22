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
 * Represents a level in the game.
 * Each level has a name and an array of categories.
 */
public class level {
    String name;
    Category[] categories;
    public level(String name, Category[] categories) {
        this.name = name;
        this.categories = categories;
    }
}
