package io.zipcoder;

import java.util.*;

public class Classroom {
    Student [] allStudents;



    public Classroom (Student[] students){
        this.allStudents = students;
    }


    public Classroom (int maxNumberOfStudents){
        this.allStudents = new Student[maxNumberOfStudents];
    }

    public Classroom(){
        this.allStudents = new Student[30];
    }


    public Student [] getStudents (){
        return this.allStudents;
    }

    public double getAverageExamScore(){
        double examScores = 0;

        for (int i = 0; i < this.allStudents.length; i++){
            for (int k = 0; k < this.allStudents[i].testScores.size(); k++){
                examScores += this.allStudents[i].testScores.get(k);
            }
        }

        return examScores/this.allStudents.length;
    }

    public void addStudent (Student newStudent){
        int positionToAddStudent = 0;

        for (int i = 0; i < this.allStudents.length; i++){
            if (this.allStudents[i] == null) {
                positionToAddStudent = i;
                break;
            }
        }
        this.allStudents[positionToAddStudent] = newStudent;

    }

    public void removeStudent (String firstName, String lastName){

        int lastStudentIndex = allStudents.length - 1;
        int indexStudentToBeRemoved = 0;

        for (int i = 0; i < allStudents.length; i++){
            if (allStudents[i].getFirstName().equals(firstName) && allStudents[i].getLastName().equals(lastName)){
                indexStudentToBeRemoved = i;
            }
        }

        for (int i = indexStudentToBeRemoved; i < allStudents.length; i ++){
            if (i!= allStudents.length - 1) allStudents[i] = allStudents[i+1];
        }

        allStudents[lastStudentIndex] = null;
    }

    public Student [] getStudentsByScore(){
        double studentOneAverageScore = 0.0;
        double studentTwoAverageScore = 0.0;
        Student tempPosition;
        Student [] tempStudents = new Student[allStudents.length];
        int counter = 0;

        //TODO add lexigraphical sorting

        for (int i = 0; i < allStudents.length; i++){
            if (allStudents.length > 1){
                for (int k = i; k < allStudents.length ; k++){
                    studentOneAverageScore = allStudents[i].getAverageExamScores();
                    studentTwoAverageScore = allStudents[k].getAverageExamScores();
                    if ( studentOneAverageScore > studentTwoAverageScore){
                        tempPosition = allStudents[i];
                        allStudents[i] = allStudents[k];
                        allStudents[k] = tempPosition;
                    }
                }
            }
        }

        // reverse the order to make it descending
        for (int i = allStudents.length - 1; i >=0; i --){
            tempStudents[counter] = allStudents[i];
            counter ++;
        }
        allStudents = tempStudents;
        return allStudents;
    }

    public  void getGradeBook1 (){
        double meanScore = getAverageExamScore();


    }


    public TreeMap<Character, ArrayList<Student>> getGradeBook() {

        TreeMap<Character, ArrayList<Student>> gradeBook = new TreeMap<>();
/*
        int numOfStudents = allStudents.length;
        double averageScore = 0;
        Set<Double> averageTestScoreSet = new TreeSet<Double>();
        Map averageScoresMap = new TreeMap();

        // get average scores in a sorted manner
        for (int i = 0; i < numOfStudents; i++){
            averageScore = allStudents[i].getAverageExamScores();
            averageTestScoreSet.add(averageScore);
        }

        // set the sample size and store unique values in a Map
        int numberOfUniqueAverageScores = averageTestScoreSet.size();
        double [] scores = new double[numberOfUniqueAverageScores];
        Iterator<Double> iterator = averageTestScoreSet.iterator();
        int setElements = 0;
        // retrieve the unique average score values
        while (iterator.hasNext()){
            scores[setElements] = iterator.next();
            setElements++;
        }
        // store them in a map from 1 to n (where n is the nr of unique tests)
        for (int i =0; i < numberOfUniqueAverageScores; i++){
            averageScoresMap.put(i+1,scores[i]);
        }


        double studentAverageScore;
        Character gradeLetter;
        double percentile;

        for (int i = 1; i < numOfStudents; i++){
            percentile = (numberOfUniqueAverageScores + 1)/100;
            if (percentile <= .1) gradeLetter = 'A';
            else if (percentile > .1 && percentile <= .29) gradeLetter = 'B';
            else if (percentile > .29 && percentile <= .50) gradeLetter = 'C';
            else if (percentile > .50 && percentile <= .89) gradeLetter = 'D';
            else gradeLetter = 'F';


        }




        for (int i = 1; i <= numOfStudents; i++) {

            Double percent = ((i - 1) / (double) numOfStudents);

            Character gradeLetter;

            if (percent <= .1) gradeLetter = 'A';
            else if (percent > .1 && percent <= .29) gradeLetter = 'B';
            else if (percent > .29 && percent <= .50) gradeLetter = 'C';
            else if (percent > .50 && percent <= .89) gradeLetter = 'D';
            else gradeLetter = 'F';

            if (!gradeBook.containsKey(gradeLetter)) {
                gradeBook.put(gradeLetter, new ArrayList<Student>());
            }

            ArrayList<Student> currentStudents = gradeBook.get(gradeLetter);

            Student student = allStudents[i - 1];
            currentStudents.add(student);
            gradeBook.put(gradeLetter, currentStudents);
        }  */
        return gradeBook;

    }

}

