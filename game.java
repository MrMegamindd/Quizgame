/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizgame;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ahmed
 */
/**
 * Represents a game that consists of levels, players, and questions.
 */
public class game  {
    level[] levels;
    player[] players;
    Scanner scanner;
/**
     * Constructs a game object with the given levels and players.
     *
     * @param levels  an array of levels in the game
     * @param players an array of players in the game
     */
    public game(level[] levels, player[] players) {
        this.levels = levels;
        this.players = players;
        this.scanner = new Scanner(System.in);
    }
    /**
     * Saves the questions from the levels to a file named "questions.txt".
     * Each question is written in the format: "question;answer;category;level".
     */
public void saveQuestionsToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("questions.txt"))) {
            for (level l : levels) {
                for (Category c : l.categories) {
                    for (Question q : c.questions) {
                        writer.println(q.question + ";" + q.answer + ";" + c.name + ";" + l.name);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
 * Loads questions from a file and organizes them into levels and categories.
 * Each line in the file should contain a question and its corresponding answer, separated by a semicolon (;).
 * The file should follow the format: question;answer;category;level
 * 
 * @throws IOException if an I/O error occurs while reading the file
 */
public void loadQuestionsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("questions.txt"))) {
            String line;
            List<Question> questions = new ArrayList<>();
            String currentCategory = "";
            String currentLevel = "";
            List<Category> categories = new ArrayList<>();
            List<level> levelsList = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length != 4) continue;

                if (!parts[2].equals(currentCategory)) {
                    if (!questions.isEmpty()) {
                        categories.add(new Category(currentCategory, questions.toArray(new Question[0])));
                        questions.clear();
                    }
                    currentCategory = parts[2];
                }

                if (!parts[3].equals(currentLevel)) {
                    if (!categories.isEmpty()) {
                        levelsList.add(new level(currentLevel, categories.toArray(new Category[0])));
                        categories.clear();
                    }
                    currentLevel = parts[3];
                }

                questions.add(new Question(parts[0], parts[1]));
            }

            // Add remaining questions, categories, and levels
            if (!questions.isEmpty()) {
                categories.add(new Category(currentCategory, questions.toArray(new Question[0])));
            }
            if (!categories.isEmpty()) {
                levelsList.add(new level(currentLevel, categories.toArray(new Category[0])));
            }

            this.levels = levelsList.toArray(new level[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
/**
     * Starts the game by loading questions, iterating through levels, categories, and questions,
     * and prompting players for answers. Updates player scores and displays the final score for each player.
     */
    public void start() {
        loadQuestionsFromFile();
        for (player p : players) {
            System.out.println("Player: " + p.name);
            // Resetting score at the start of the game
            p.score = 0; 
            // Count the number of wrong answers
            int wrongAnswers = 0; 

            for (level l : levels) {
                System.out.println("Level: " + l.name);

                for (Category c : l.categories) {
                    System.out.println("Category: " + c.name);

                    for (Question q : c.questions) {
                        System.out.println("Question: " + q.question);
                        System.out.print("Enter your answer: ");
                        String playerAnswer = scanner.nextLine();

                        if (playerAnswer.equalsIgnoreCase(q.answer)) {
                            System.out.println("Correct!");
                            p.score++;
                        } else {
                            System.out.println("Wrong! The correct answer is: " + q.answer);
                            wrongAnswers++;
                            if(wrongAnswers == 3)
                            {
                                System.out.println("Game Over");
                                return;
                            }
                        }
                    }
                }
            }

            System.out.println(p.name + "'s final score: " + p.score);
        }
    }
}
