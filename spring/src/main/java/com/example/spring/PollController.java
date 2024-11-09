package main.java.com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/polls")
public class PollController {
    @Autowired
    private PollService pollService;
    
    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @PostMapping
    public Poll addPoll(@RequestBody Poll poll) {
        return pollService.savePoll(poll);
    }

    @GetMapping
    public List<Poll> getAllPolls(@RequestBody Poll poll) {
        return pollService.getAllPolls();
    }

    // @PostMapping
    // public addVote(@RequestBody Poll poll) {
    //     pollService.addVote(poll);
    // }
}
