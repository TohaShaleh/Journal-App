package com.example.journalApp.service;

import com.example.journalApp.entity.Journal;
import com.example.journalApp.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalService {

    private final JournalRepository journalRepository;

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal createJournal(Journal journal) {
        return journalRepository.save(journal);
    }
}
