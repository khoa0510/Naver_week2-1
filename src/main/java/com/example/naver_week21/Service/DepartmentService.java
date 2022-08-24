package com.example.naver_week21.Service;

import com.example.naver_week21.Entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    public Department createDepartment(Department department);

    public List<Department> getAllDepartment();

    public Optional<Department> getDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public String deleteDepartment(Long departmentId);
}
