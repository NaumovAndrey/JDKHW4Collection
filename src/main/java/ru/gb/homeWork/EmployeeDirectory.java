package ru.gb.homeWork;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EmployeeDirectory {
    public static void main(String[] args) {
        List<Employee> employee = employeeList();
        Set<Employee> set = new HashSet<>(employee);

        System.out.println(experience(set, 3));
        System.out.println(phoneNumber(set, "Андрей"));
        System.out.println(id(set, 2));

        newEmployee(employee, 60, "89950845321", "А", 0);
        System.out.println(employee);
    }

    public static List<Employee> employeeList(){
        List<Employee> employee = new ArrayList<>();
        employee.add(new Employee(1, "89050845321", "Андрей", 3));
        employee.add(new Employee(1, "89050845321", "Андрей", 3));
        employee.add(new Employee(2, "89050845322", "Константин", 6));
        employee.add(new Employee(3, "89050845323", "Денис", 8));
        employee.add(new Employee(4, "89050845324", "Роман", 1));
        employee.add(new Employee(5, "89050845325", "Дмитрий", 7));
        employee.add(new Employee(6, "89050845326", "Александр", 3));
        employee.add(new Employee(7, "89050845327", "Ренат", 13));
        employee.add(new Employee(8, "89050845328", "Руслан", 4));
        employee.add(new Employee(9, "89050845329", "Артём", 0));

        return employee;
    }

    public static Set<Employee> experience(Set<Employee> set, int exp){
        Set<Employee> employeeSet = new HashSet<>();
        set.stream().filter(employee -> employee.getExperience() == exp).forEach(employeeSet::add);

        return employeeSet;
    }

    public static Set<Employee> phoneNumber(Set<Employee> set, String exp){
        Set<Employee> employeeSet = new HashSet<>();
        set.stream().filter(employee -> employee.getName().equals(exp)).forEach(employeeSet::add);

        return employeeSet;
    }

    public static Set<Employee> id(Set<Employee> set, int exp){
        Set<Employee> employeeSet = new HashSet<>();
        set.stream().filter(employee -> employee.getId() == exp).forEach(employeeSet::add);

        return employeeSet;
    }

    public static void newEmployee(List<Employee> employee, int id, String phone, String name, int experince){
        employee.add(new Employee(id, phone, name, experince));
        System.out.println("клиент в корзинке!!!");
    }
}