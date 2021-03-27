package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public Person findById(long id) {
        //why are we using for each loop?
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public Boolean contains(Person person) {
        if (personList.contains(person)) {
            return true;
        }
        return false;
    }//Why does it return void?
    public void remove(Person person){
        personList.remove(person);

    }
    public void removeAll(long id){
        for(Person person: personList){
            if(person.getId()==id){

            }
        }
    }
    //public double count() {
     //   returns
    }



}