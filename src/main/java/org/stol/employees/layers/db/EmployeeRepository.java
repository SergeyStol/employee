package org.stol.employees.layers.db;

import org.stol.employees.layers.db.dao.EmployeeDao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<EmployeeDao, Long> {
}
