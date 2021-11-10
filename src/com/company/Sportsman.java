package com.company;

public class Sportsman {
    Workout workout;

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
    public void changeWorkout(int day){
        System.out.println("Day of training: "+day);
        if(day%7==0) {
            setWorkout(new Rest());
        }
        if ((day-1)%7==0){
            setWorkout(new LegTraining());
        }
        if(workout instanceof LegTraining){
            setWorkout(new HandTraining());
        }else if (workout instanceof HandTraining){
            setWorkout(new LegTraining());
        }

    }
    public void training(){
        workout.training();
    }
}
