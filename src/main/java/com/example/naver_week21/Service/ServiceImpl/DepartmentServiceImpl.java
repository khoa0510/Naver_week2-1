package com.example.naver_week21.Service.ServiceImpl;

import com.example.naver_week21.Entity.Department;
import com.example.naver_week21.Repository.DepartmentRepository;
import com.example.naver_week21.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        departmentRepository.save(department);
        return department;
    }

    public List<Department> getAllDepartment() {
        return departmentRepository.findAll();
    }

    public Optional<Department> getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    public Department updateDepartment(Long departmentId, Department department){
        department.setDepartmentId(departmentId);
        departmentRepository.save(department);
        return department;
    }

    public String deleteDepartment(Long departmentId){
        departmentRepository.deleteById(departmentId);
        return "Delete complete";
    }
}
