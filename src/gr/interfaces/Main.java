package gr.interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please insert the sport of your interest!");
        Scanner console = new Scanner(System.in);
        String sport = console.next();
        GetCoach coach = new GetCoach();
        coach.getCoach(sport).warmup();
        coach.getCoach(sport).training();
        coach.getCoach(sport).recovery();
    }
}
