//package com.example.journalApp.controller;
//
//import com.example.journalApp.Model.JournalEntry;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.*;
//
//@RestController
//@RequestMapping("/journal")
//public class JournalEntryController {
//
//      private Map<Long, JournalEntry> journalEntries=new HashMap<>();
//
//      @GetMapping
//      public List<JournalEntry> getAllEntries()
//      {
//          return new ArrayList<>(journalEntries.values());
//      }
//
//      @PostMapping
//      public JournalEntry createEntries(@RequestBody JournalEntry newEntry)
//      {
//          journalEntries.put(newEntry.getId(),newEntry);
//          return newEntry;
//      }
//
//      @GetMapping("/id/{myId}")
//      public JournalEntry getEntryById(@PathVariable long myId)
//      {
//          return journalEntries.get(myId);
//
//      }
//
//      @DeleteMapping("/id/{delId}")    // We can do this also by @GetMapping .. but this is the Standard Way to handle http req.
//      public String delEntryById(@PathVariable long delId)
//      {
//          journalEntries.remove(delId);
//          return "Deleted the Entry with id : "+delId;
//      }
//
//      @PutMapping("/id/{updateId}")
//      public String updateEntryById(@PathVariable long updateId, @RequestBody JournalEntry objEntry)
//      {
//          journalEntries.put(updateId,objEntry);  // It will override all values of an Entry in updateId
//          return "Updated the values in Entry with Id : "+updateId;
//      }
//
//
//}
