package org.stol.employees.layers.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDto {
    long id;
    String name;
}
