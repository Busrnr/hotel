package com.example.examplespring.data.repository;

import java.util.*;
import com.example.examplespring.data.entity.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,Long>{
    Iterable<Reservation> findReservationByReservationDate(Date date);
}
