package com.eaiesb;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeReppository extends MongoRepository<Employee, String> {

}
