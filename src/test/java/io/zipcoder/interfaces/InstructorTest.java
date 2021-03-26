package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
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
    public void testTeach(){
        //Given
        Instructor instructor = new Instructor(777,"Ashley");

        //When

        //Then
    }

    @Test
    public void lecture() {
        //Given
        //When
        //Then
    }
}