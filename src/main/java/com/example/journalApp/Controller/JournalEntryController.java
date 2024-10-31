package com.example.journalApp.Controller;

import com.example.journalApp.Model.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

      private Map<Long, JournalEntry> journalEntries=new HashMap<>();

      @GetMapping
      public List<JournalEntry> getAllEntries()
      {
          return new ArrayList<>(journalEntries.values());
      }

      @PostMapping
      public JournalEntry createEntries(@RequestBody JournalEntry newEntry)
      {
          journalEntries.put(newEntry.getId(),newEntry);
          return newEntry;
      }

      @GetMapping("/id/{myId}")
      public JournalEntry getEntryById(@PathVariable long myId)
      {
          return journalEntries.get(myId);

      }

      @DeleteMapping("/id/{delId}")
      public String delEntryById(@PathVariable long delId)
      {
          journalEntries.remove(delId);
          return "Deleted the Entry with id : "+delId;
      }

//      @PutMapping("/id/{updateId}")
//      public String updateEntryById(@PathVariable long updateId)
//      {
//          journalEntries.put(updateId,)
//      }


}
