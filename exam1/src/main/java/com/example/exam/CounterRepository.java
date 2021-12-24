package com.example.exam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CounterRepository extends JpaRepository<Counter, Long> {
    @Query(value = "select * from counter order by created_date desc limit 1", nativeQuery = true)
    Optional<Counter> findLast();
}
