package io.zipcoder;
import org.junit.Assert;
import org.junit.Test;

public class ClassroomTest {

    @Test
    public void getStudents() {
        Double[] student1Scores = {100.0, 150.0, 95.0};
        Double[] student2Scores = {225.0, 25.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] allStudents = {student1, student2};
        Classroom testClassroom = new Classroom(allStudents);

        Student [] classroomStudents = testClassroom.getStudents();
        int expected = 3;
        int actual = classroomStudents[0].getNumberOfExamsTaken();

        Assert.assertEquals(expected,actual);

        expected = 2;
        actual = classroomStudents[1].getNumberOfExamsTaken();

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void testGetAverageExamScore() {
        Double[] student1Scores = {100.0, 150.0};
        Double[] student2Scores = {225.0, 25.0};

        Student student1 = new Student("student", "one", student1Scores);
        Student student2 = new Student("student", "two", student2Scores);

        Student[] allStudents = {student1, student2};
        Classroom testClassroom = new Classroom(allStudents);

    }


}

