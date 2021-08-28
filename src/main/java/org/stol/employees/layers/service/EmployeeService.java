package org.stol.employees.layers.service;

import org.stol.employees.layers.api.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.stol.employees.layers.api.exceptions.NotFoundException;
import org.stol.employees.layers.db.EmployeeRepository;
import org.stol.employees.layers.db.dao.EmployeeDao;

import static org.stol.employees.common.ExceptionMessages.CANT_FIND_EMPLOYEE_WITH_ID;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository repo;

    public EmployeeDto getEmployeeById(long employeeId) {
        if (employeeId < 0)
            throw new RestClientException("Wrong id");

        return repo.findById(employeeId)
                .map(EmployeeService::convertDaoToDto)
                .orElseThrow(() -> new NotFoundException(CANT_FIND_EMPLOYEE_WITH_ID + employeeId));
    }

    private static EmployeeDto convertDaoToDto(EmployeeDao employeeDao) {
        return EmployeeDto.builder()
                .id(employeeDao.getId())
                .name(employeeDao.getName())
                .build();
    }
}
