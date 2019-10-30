package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Student {
    private String firstName;
    private String lastName;
    private Integer numberOfExamsTaken;




    ArrayList<Double> testScores = new ArrayList<Double>();
    //ArrayList<Double> examScores;


    public Student(String studentFirstName, String studentLasName, Double [] examScores) {
        this.firstName = studentFirstName;
        this.lastName = studentLasName;
        Collections.addAll(this.testScores,examScores);
        //this.examScores.addAll(Arrays.asList(testScores));
        //examScores = new ArrayList<Double>();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getTestScores() {
        return testScores;
    }

    public Integer getNumberOfExamsTaken(){
        return numberOfExamsTaken;
    }


    public String getExamScores(){
        String examScores = "";

        for(int i = 0; i < testScores.size(); i++){
            examScores += formatString(i,testScores.get(i));
        }

        return examScores;
    }

    private String formatString (int counter, Double examScore){
        return "Exam " + (counter+1) + " ->  " + String.format("%.0f",examScore) + "\n";
    }

}
