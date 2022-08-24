package com.example.naver_week21.Controller;

import com.example.naver_week21.Entity.Department;
import com.example.naver_week21.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/")
    public Department createDepartment(@RequestBody Department department) {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/")
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }

    @GetMapping("/{departmentId}")
    public Optional<Department> getDepartmentById(@PathVariable("departmentId") Long departmentId) {
        return departmentService.getDepartmentById(departmentId);
    }

    @PutMapping("/{departmentId}")
    public Department updateDepartment(@PathVariable("departmentId") Long departmentId,
                                       @RequestBody Department department) {
        return departmentService.updateDepartment(departmentId ,department);
    }

    @DeleteMapping("/{departmentId}")
    public String deleteDepartment(@PathVariable("departmentId") Long departmentId) {
        return departmentService.deleteDepartment(departmentId);
    }
}
