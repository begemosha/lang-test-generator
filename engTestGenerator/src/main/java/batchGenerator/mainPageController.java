package batchGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class mainPageController {
	
	@Autowired
	private Sentence sentence;
	
    @RequestMapping("/")
    String home() {
    	String rndSentence = sentence.getRandom();
    	System.out.println(rndSentence);
        return rndSentence;
    }
}
