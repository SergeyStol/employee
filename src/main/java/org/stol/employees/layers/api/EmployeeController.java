package org.stol.employees.layers.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.stol.employees.layers.api.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.stol.employees.layers.service.EmployeeService;

@RestController("/v1")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService service;

    @GetMapping("/employees/{employeeId}")
    EmployeeDto getEmployeeById(@PathVariable("employeeId") long employeeId) {
        return service.getEmployeeById(employeeId);
    }
}