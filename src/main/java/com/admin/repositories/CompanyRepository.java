package com.admin.repositories;

import com.admin.models.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "companies", path = "companies")
public interface CompanyRepository extends MongoRepository<Company, String> {
    List<Company> findByName(@Param("name") String name);
}
