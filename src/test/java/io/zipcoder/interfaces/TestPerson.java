package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

@Test

    public void testConstructor() {
    //Given
    long expectedId = 777;
    String expectedName = "Ashley";
    Person person = new Person(expectedId, expectedName);
    //When
    long actualId = person.getId();
    String actualName = person.getName();
    //Then
    Assert.assertEquals(expectedId, actualId);
    Assert.assertEquals(expectedName, actualName);
    }

    @Test

    public void testSetName (){
    //Given
    long ashleyId = 777;
    String ashleyName = "Ashley";
    Person person = new Person(ashleyId, ashleyName);
    //When
    String expectedName = "Smartist";
    person.setName(expectedName);
    String actualName = person.getName();
    //Then
    Assert.assertEquals(expectedName, actualName);
}

}
