package com.example.status;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StatusRepository extends JpaRepository<Status, String> {
    List<Status> findByNombre(String nombre);
    void deleteByNombre(String nombre);
}

//mvnw.cmd spring-boot:run
