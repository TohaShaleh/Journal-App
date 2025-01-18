package com.example.journalApp.controller;

import com.example.journalApp.entity.Journal;
import com.example.journalApp.service.JournalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/journals")
public class JournalController {

    private final JournalService journalService;

    public JournalController(JournalService journalService) {
        this.journalService = journalService;
    }

    @GetMapping
    public List<Journal> getAllJournals() {
        return journalService.getAllJournals();
    }

    @GetMapping("/{id}")
    public Journal getJournalById(@PathVariable Long id) {
        return journalService.getJournalById(id);
    }

    @GetMapping("/search")
    public List<Journal> searchJournalsByTitle(@RequestParam String title) {
        return journalService.searchJournalsByTitle(title);
    }

    @PostMapping
    public Journal createJournal(@RequestBody Journal journal) {
        return journalService.createJournal(journal);
    }

    @PutMapping("/{id}")
    public Journal updateJournal(@PathVariable Long id, @RequestBody Journal updatedJournal) {
        return journalService.updateJournal(id, updatedJournal);
    }

    @DeleteMapping("/{id}")
    public String deleteJournal(@PathVariable Long id) {
        journalService.deleteJournal(id);
        return "Journal entry deleted successfully!";
    }
}
