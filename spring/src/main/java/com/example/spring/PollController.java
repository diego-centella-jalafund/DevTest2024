package main.java.com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/polls")
public class PollController {
    @Autowired
    private final PollService pollService;
    
    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public ResponseEntity<Poll> addPoll(@RequestBody Poll poll) {
        Poll pollcreated = pollService.savePoll(poll);
        return new ResponseEntity<>(pollcreated, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Poll>> getAllPolls() {
        List<Poll> polls = pollService.getAllPolls();
        return new ResponseEntity<>(polls, HttpStatus.OK);
    }

    // @PostMapping
    // public addVote(@RequestBody Poll poll) {
    //     pollService.addVote(poll);
    // }
}
