package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    double totalStudyTime = 100;

    public Student(long id, String name) {
        super(id, name);
    }

    public double learn(double numberOfHours) {
        double totalTime = totalStudyTime+ numberOfHours;
        return totalTime;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
