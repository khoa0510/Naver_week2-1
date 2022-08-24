package com.example.naver_week21.Service.ServiceImpl;

import com.example.naver_week21.Entity.Employee;
import com.example.naver_week21.Repository.EmployeeRepository;
import com.example.naver_week21.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeeByDepartmentId(Long departmentId) {
        return employeeRepository.findByDepartment_DepartmentId(departmentId);
    }

    public Optional<Employee> getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId);
    }

    public Employee updateEmployee(Long employeeId, Employee employee){
        employee.setEmployeeId(employeeId);
        employeeRepository.save(employee);
        return employee;
    }

    public String deleteEmployee(Long employeeId){
        employeeRepository.deleteById(employeeId);
        return "Delete complete";
    }
}
