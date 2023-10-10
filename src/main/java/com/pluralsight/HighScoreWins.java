package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//  Prompt the user for game score
        System.out.print("Please enter game score ('home team':'visitor team' | 'home score':'visitor score'): ");
        String userInput = scanner.nextLine();

//  Split the user input on the pipe (|) to get team and score information
        String[] parts = userInput.split("\\|");

        if (parts.length != 2) {
            System.out.println("Invalid input format. Please use the format 'home team':'visitor team' | 'home score':'visitor score'");
            return;
        }

//  Split the team names on the colon (:)
        String[] teamInfo = parts[0].split(":");

        if (teamInfo.length != 2) {
            System.out.println("Invalid team name format. Please use the format 'home team':'visitor team'");
            return;
        }

//  Split the scores on the colon (:)
        String[] scoreInfo = parts[1].split(":");

        if (scoreInfo.length != 2) {
            System.out.println("Invalid score format. Please use the format 'home score':'visitor score'");
            return;
        }

//  Extract team names and scores
        String homeTeam = teamInfo[0].trim();
        String visitorTeam = teamInfo[1].trim();
        int homeScore = Integer.parseInt(scoreInfo[0].trim());
        int visitorScore = Integer.parseInt(scoreInfo[1].trim());

//  Determine the winning team
        String winningTeam;
        if (homeScore > visitorScore) {
            winningTeam = homeTeam;
        } else if (homeScore < visitorScore) {
            winningTeam = visitorTeam;
        } else {
            winningTeam = "It's a tie!";
        }

//  Display the winning team
        System.out.println("The winning team is: " + winningTeam);

        scanner.close();
    }
}