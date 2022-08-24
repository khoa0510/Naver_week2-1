package com.example.naver_week21.Service;

import com.example.naver_week21.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    public List<Employee> getAllEmployee();

    public List<Employee> getEmployeeByDepartmentId(Long departmentId);

    public Optional<Employee> getEmployeeById(Long employeeId);

    public Employee updateEmployee(Long employeeId ,Employee employee);

    public String deleteEmployee(Long employeeId);
}
