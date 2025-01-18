package com.example.journalApp.repository;

import com.example.journalApp.entity.Journal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JournalRepository extends JpaRepository<Journal, Long> {
    List<Journal> findByTitleContainingIgnoreCase(String title);
}
