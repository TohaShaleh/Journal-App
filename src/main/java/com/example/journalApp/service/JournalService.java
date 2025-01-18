package com.example.journalApp.service;

import com.example.journalApp.entity.Journal;
import com.example.journalApp.repository.JournalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalService {

    private final JournalRepository journalRepository;

    public JournalService(JournalRepository journalRepository) {
        this.journalRepository = journalRepository;
    }

    public List<Journal> getAllJournals() {
        return journalRepository.findAll();
    }

    public Journal getJournalById(Long id) {
        return journalRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Journal entry not found with ID: " + id));
    }

    public List<Journal> searchJournalsByTitle(String title) {
        return journalRepository.findByTitleContainingIgnoreCase(title);
    }

    public Journal createJournal(Journal journal) {
        return journalRepository.save(journal);
    }

    public Journal updateJournal(Long id, Journal updatedJournal) {
        Optional<Journal> existingJournal = journalRepository.findById(id);
        if (existingJournal.isPresent()) {
            Journal journal = existingJournal.get();
            journal.setTitle(updatedJournal.getTitle());
            journal.setContent(updatedJournal.getContent());
            return journalRepository.save(journal);
        } else {
            throw new RuntimeException("Journal entry not found with ID: " + id);
        }
    }

    public void deleteJournal(Long id) {
        if (journalRepository.existsById(id)) {
            journalRepository.deleteById(id);
        } else {
            throw new RuntimeException("Journal entry not found with ID: " + id);
        }
    }
}
