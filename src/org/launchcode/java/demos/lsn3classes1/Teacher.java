package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }
    //_______________________________________
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String aLastName) {
        lastName = aLastName;
    }
    //_______________________________________
    public String getSubject(){
        return subject;
    }

    public void setSubject(String aSubject) {
        subject = aSubject;
    }
    //_______________________________________

    protected Integer getYearsTeaching() {
        return yearsTeaching;
    }

    protected void setYearsTeaching(int aYearsTeaching) {
        yearsTeaching = aYearsTeaching;
    }
}


