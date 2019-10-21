package com.spartaglobal.solid_shop.Students;

public class Apprentice implements IStudents {

    private String firstName;
    private String lastName;
    private String stream;
    private boolean hasLaptop;

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    @Override
    public String getStream() {
        return stream;
    }

    @Override
    public boolean hasLaptop() {
        return false;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Apprentice(String firstName, String lastName, String stream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.stream = stream;
    }
}
