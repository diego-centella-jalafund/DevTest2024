package main.java.com.example.spring;
import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
@Table(name = "polls")
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // private List<Options> options;

    
    public Poll() {
    }

    public Poll(String name) {
        this.name = name;
        // this.options = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public List<Options> getOptions() {
    //     return options;
    // }

    // public void setOptions(List<Options> options) {
    //     this.options = options;
    // }
}
