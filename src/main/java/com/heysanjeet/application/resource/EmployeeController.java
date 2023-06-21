package com.heysanjeet.application.resource;

import com.heysanjeet.application.domain.Employee;
import com.heysanjeet.application.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    public ResponseEntity<HttpStatus> saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/getEmployees")
    public ResponseEntity<List<Employee>> findAllEmployee() {
        List<Employee> employeeList = employeeRepository.findAll();
        return new ResponseEntity<>(employeeList, HttpStatus.OK);
    }

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id) {
        Employee employee = employeeRepository.findById(id).get();
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }
}
