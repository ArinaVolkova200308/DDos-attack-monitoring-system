package com.example.repository;

import com.example.model.IPRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPRecordRepository extends JpaRepository<IPRecord, Long> {
}
