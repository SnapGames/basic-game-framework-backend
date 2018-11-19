package fr.snapgames.bgf.services.score;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestScoreService{
    
    @Autowired
    private ScoreService scoreService;

    @RequestMapping("/scores")    
    public List<Score> findAll() {
        return scoreService.findAll();
    }

}