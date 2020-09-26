package com.example.examplespring.data.repository;

import com.example.examplespring.data.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest,Long>{
    
}
