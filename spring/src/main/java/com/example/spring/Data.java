package main.java.com.example.spring;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.PostConstruct;
import main.java.com.example.spring.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Data {

    @Autowired
   	private PollService pollService;
    
    @PostConstruct
    public void init() {
		List options = new ArrayList<>();
		options.add("C#");
		options.add("Java");
		options.add("Python");

		List optionsFramework = new ArrayList<>();
		optionsFramework.add("ASP.NET core");

        pollService.savePoll(new Poll("Favorite Programming Language"));
        pollService.savePoll(new Poll("Best Framework"));
    }
}
