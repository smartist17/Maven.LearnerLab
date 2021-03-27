package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void testImplementation(){
        //Given
        Instructor newInstructor = new Instructor(777,"Ashley");
        //When

        //Then
        Assert.assertTrue(newInstructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        //Given
        Instructor instructor= new Instructor(777,"Ashley");
        //When

        //Then
        Assert.assertTrue(instructor instanceof Person);

    }

    @Test
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(777,"Ashley");
        Learner ashley = new Student (777,"Ashley");
        double numberOfHours = 100;
        double totalStudyTime = 100; //Hard coded//

        //When
        double expected = 200;
        double actual = instructor.teach(ashley, 100);

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testlecture() {
        //Given
        Instructor instructor = new Instructor(777,"Ashley");
        Learner monali = new Student(778,"Monali");
        Learner lena = new Student(778,"Lena");
        Learner justin = new Student(778,"Justin");
        Learner ashley = new Student(778,"Ashley");
        Learner [] learners = new Learner[]{monali, lena, justin, ashley};
        double numberOfHours =500;
        double totalStudyTime = 10;
        //When
        learners[0]= monali;
        learners[1]= lena;
        learners[2]= justin;
        learners[3]= ashley;
        double expected = 225;
        double actual = instructor.lecture(learners,numberOfHours);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected,actual,0.001);
    }
}