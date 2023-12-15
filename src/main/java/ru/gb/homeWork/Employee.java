package ru.gb.homeWork;

public class Employee {
    private int id;
    private String phoneNumber;
    private String Name;
    private int experience;

    public Employee(int id, String phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        Name = name;
        this.experience = experience;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Name='" + Name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
