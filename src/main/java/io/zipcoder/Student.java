package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    ArrayList<Double> testScores = new ArrayList<Double>();



    public Student(String studentFirstName, String studentLasName, Double [] testScores) {
        this.firstName = studentFirstName;
        this.lastName = studentLasName;
        Collections.addAll(this.testScores,testScores);
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public Integer getNumberOfExamsTaken(){
        return this.testScores.size();
    }


    public void setExamScore(int examID, Double newScore){
        this.testScores.set(examID - 1,newScore);
    }

    public String getExamScores(){
        String examScores = "";

        for(int i = 0; i < testScores.size(); i++){
            int examID = i+1;
            examScores += formatString(examID,testScores.get(i));
        }

        return examScores;
    }

    public void addExamScore(Double examScores){
        this.testScores.add(examScores);
    }


    public Double getAverageExamScores (){
        double sumOfExamScores = 0;

        for (int i = 0; i < this.testScores.size(); i++) {
            sumOfExamScores += this.testScores.get(i);
        }
        return sumOfExamScores/this.testScores.size();
    }

    @Override
    public String toString() {
        String result = getExamScores();

        return "Student Name: " + this.firstName + " " + this.lastName + "\n" +
                "Exam Scores:\n" + result;
    }

    private String formatString (int counter, Double examScore){
        return "\t" + "Exam " + (counter) + " ->  " + String.format("%.0f",examScore) + "\n";
    }

}
