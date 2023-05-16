package ru.skypro.mvc.homework31_2.service;

import org.springframework.stereotype.Service;
import ru.skypro.mvc.homework31_2.pojo.Employee;
import ru.skypro.mvc.homework31_2.repository.EmployeeRepository;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository=employeeRepository;
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.getAllEmployee();
    }

    public String getSalarySum() {
        return employeeRepository.getSalarySum();
    }

    @Override
    public String getMinSalary() {
        return  employeeRepository.getMinSalary();
    }

    @Override
    public String getMaxSalary() {
        return employeeRepository.getMaxSalary();
    }

    @Override
    public List<Employee> getEmployeeWithHighSalary() {
        return employeeRepository.getEmployeeWithHighSalary();
    }
}
