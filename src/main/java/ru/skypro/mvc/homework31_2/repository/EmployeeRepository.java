package ru.skypro.mvc.homework31_2.repository;

import ru.skypro.mvc.homework31_2.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployee();

    public String getSalarySum();

    public String getMinSalary();

    public String getMaxSalary();

    public List<Employee> getEmployeeWithHighSalary();
}
