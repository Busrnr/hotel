package com.example.examplespring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.examplespring.data.entity.*;

@Repository
public interface RoomRepository extends CrudRepository<Room,Long>{
    
}
