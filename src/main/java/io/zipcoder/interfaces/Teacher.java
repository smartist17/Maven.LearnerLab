package io.zipcoder.interfaces;
import io.zipcoder.interfaces.Learner;
import io.zipcoder.interfaces.Person;

public interface Teacher {

    public void teach(Learner learner, double numberOfHours);

    public double lecture(Learner[] learners, double numberOfHours);


}
