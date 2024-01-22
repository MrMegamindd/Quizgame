/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizgame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JButton startButton;
    private JTextArea questionArea;
    private JTextField answerField;
    private JLabel scoreLabel;
    // other components as needed
    private int score = 0; // Score variable

    public GUI() {
        // Initialize components and layout
        startButton = new JButton("Start Game");
        questionArea = new JTextArea("Question appears here");
        answerField = new JTextField(20);
        scoreLabel = new JLabel("Score: 0");

        // Setting Layout
        this.setLayout(new FlowLayout()); // Using FlowLayout for simplicity

        // Adding components to the frame
        this.add(startButton);
        this.add(questionArea);
        this.add(answerField);
        this.add(scoreLabel);

        // Add action listeners
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startGame();
            }
        });

        // More setup...
        this.setTitle("Quiz Game"); // Set window title
        this.setSize(400, 300); // Set window size
    }

    private void startGame() {
        // Start game logic
        // Placeholder for starting the game
    }

    private void updateQuestion(String question) {
        // Update question text
        questionArea.setText(question);
    }

    private void checkAnswer(String answer) {
        // Check if answer is correct and update score
    }
    
}
