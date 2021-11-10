package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Workout workout = new HandTraining();
        Sportsman tima = new Sportsman();
        tima.setWorkout(workout);
        for(int i=0;i<15;i++){
            tima.training();
            tima.changeWorkout(i);

        }
    }
}
