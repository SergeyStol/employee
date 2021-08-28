package org.stol.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.stol.employees.layers.db.EmployeeRepository;
import org.stol.employees.layers.db.dao.EmployeeDao;

@SpringBootApplication
public class EmployeesApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesApplication.class, args);
    }

    @Autowired
    private EmployeeRepository repo;

    @Override
    public void run(String... args) throws Exception {
        repo.save(new EmployeeDao(123, "Name123"));
    }
}
