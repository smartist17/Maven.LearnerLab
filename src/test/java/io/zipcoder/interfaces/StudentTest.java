package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testImplementation(){
    //Given
    Student newStudent = new Student(777,"Ashley");
    //When

    //Then
    Assert.assertTrue(newStudent instanceof Learner);
    }
    @Test
    public void testInheritance(){
    //Given
    Student newStudent = new Student(777,"Ashley");
    //When

    //Then
    Assert.assertTrue(newStudent instanceof Person);

    }
    @Test
    public void testlearn() {
    //Given
    Student newStudent = new Student(777,"Ashley");
    double hours = 500;

    //When
    double expectedAmountOfTime =600;
    double actualAmountOfTime = newStudent.learn(hours);
    //Then
    Assert.assertEquals(expectedAmountOfTime, actualAmountOfTime, 0.001);
    }
}