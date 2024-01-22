/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quizgame;
/**
 * The Main class represents the entry point of the program.
 * It initializes the game and starts the gameplay.
 */
/**
 *
 * @author Ahmed
 */
public class QuizGame {

    /**
     * The main method is the entry point of the program.
     * It creates categories, questions, levels, and a player.
     * It then initializes the game and starts the gameplay.
     *
     * @param args The command line arguments.
     */
    public static void main(String[] args) {
        
        // Creat "Math questions" category
        Question question1 = new Question("What is 3 * 5?", "15");
        Question question2 = new Question("What is 5 * 14?", "70");
        Question question3 = new Question("What is 3 + 3?", "6");
        Question[] questions = {question1, question2, question3};
        Category Math = new Category("Java questions", questions);
        // Create "geography questions" category
        Question question4 = new Question("What is the capital city of Japan?", "Tokyo");
        Question question5 = new Question("What is the capital city of Australia?", "Canberra");
        Question question6 = new Question("What is the capital city of Canada?", "Ottawa");
        Question[] questions2 = {question4, question5, question6};
        Category Geography = new Category("Geography questions", questions2);
        // Create "Human body parts questions" category
        Question question7 = new Question("What is the largest organ in the human body?", "Skin");
        Question question8 = new Question("What is the largest bone in the human body?", "Femur");
        Question question9 = new Question("What is the largest muscle in the human body?", "Gluteus Maximus");
        Question[] questions3 = {question7, question8, question9};
        Category HumanBodyParts = new Category("Human body parts questions", questions3);
        //making harder math questions for the medium level
        Question question10 = new Question("What is 3 * 5 * 2?", "30");
        Question question11 = new Question("What is 5 * 14 * 2?", "140");
        Question question12 = new Question("What is 3 + 3 * 2?", "9");
        Question[] questions4 = {question10, question11, question12};
        Category Math2 = new Category("Harder math questions", questions4);
        //making phyisics questions for the medium level
        Question question13 = new Question("What is the formula for force?", "Force = mass * acceleration");
        Question question14 = new Question("What is the formula for acceleration?", "Acceleration = force / mass");
        Question question15 = new Question("What is the formula for mass?", "Mass = force / acceleration");
        Question[] questions5 = {question13, question14, question15};
        Category Physics = new Category("Physics questions", questions5);
        //making chemistry questions for the medium level
        Question question16 = new Question("What is the formula for water?", "H2O");
        Question question17 = new Question("What is the formula for carbon dioxide?", "CO2");
        Question question18 = new Question("What is the formula for methane?", "CH4");
        Question[] questions6 = {question16, question17, question18};
        Category Chemistry = new Category("Chemistry questions", questions6);
        //making hard and complex math questions for the hard level
        Question question19 = new Question("What is the derivative of sin(x) + cos(x)?", "cos(x) - sin(x)");
        Question question20 = new Question("What is the integral of 2x^2 + 3x + 1?", "(2/3)x^3 + (3/2)x^2 + x + C");
        Question question21 = new Question("What is the limit of (1/x) as x approaches infinity?", "0");
        Question[] questions7 = {question19, question20, question21};
        Category Math3 = new Category("Hard and complex math questions", questions7);
        //making hard physics questions for the hard level
        Question question22 = new Question("What is the formula for the force of gravity?", "F = G * (m1 * m2) / r^2");
        Question question23 = new Question("What is the formula for the force of gravity on Earth?", "F = (G * m1) / r^2");
        Question question24 = new Question("What is the formula for the force of gravity on the moon?", "F = (G * m1) / r^2");
        Question[] questions8 = {question22, question23, question24};
        Category Physics2 = new Category("Hard physics questions", questions8);
        //making hard chemistry questions for the hard level
        Question question25 = new Question("What is the formula for the chemical compound sodium chloride?", "NaCl");
        Question question26 = new Question("What is the formula for the chemical compound sodium hydroxide?", "NaOH");
        Question question27 = new Question("What is the formula for the chemical compound sodium carbonate?", "Na2CO3");
        Question[] questions9 = {question25, question26, question27};
        Category Chemistry2 = new Category("Hard chemistry questions", questions9);
        // Create "Easy" level
        Category[] EasyCategories = {Math, Geography, HumanBodyParts};
        level Easy = new level("Easy", EasyCategories);
        // Create "Medium" level
        Category[] MediumCategories = {Math2, Physics, Chemistry};
        level Medium = new level("Medium", MediumCategories);
        // Create "Hard" level   
        Category[] HardCategories = {Math3, Physics2, Chemistry2};
        level Hard = new level("Hard", HardCategories);
        // Create a player
        player Ahmad = new player("Ahmad", 0);
        
        level[] levels = {Easy, Medium, Hard};
        player[] players = {Ahmad};
        game game1 = new game(levels, players);
        game1.saveQuestionsToFile();
        // Start game
        game1.start();
        
    }
}
