package org.launchcode.java.demos.lsn4classes2;

import java.util.Objects;

public class CourseEx {
    private String title;
    private int credits;
    private String instructor;

    public CourseEx (String title, int credits, String instructor) {
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseEx courseEx = (CourseEx) o;
        return title.equals(courseEx.title) && instructor.equals(courseEx.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }
}
