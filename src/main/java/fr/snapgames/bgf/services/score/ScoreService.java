package fr.snapgames.bgf.services.score;


import com.opencsv.CSVReader;
import com.zetcode.bean.Country;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

import fr.snapgames.bgf.services.score.entities.Score;

@Service
public class ScoreService implements IScoreService {
    private final ArrayList<Score> scores;


    public ScoreService(){
        scores = new ArrayList<>();
    }


    /**
     * Retrieve all score.
     */
    public List<Score> findAll(){
        FileInputStream fis = null;

        try {

            String fileName = "src/main/resources/scores.csv";

            fis = new FileInputStream(new File(fileName));
            CSVReader reader = new CSVReader(new InputStreamReader(fis));
            String[] nextLine;
            reader.readNext();
            s
            while ((nextLine = reader.readNext()) != null) {

                Score newScore = new Score(
                    Integer.valueOf(nextLine[0]),
                    nextLine[1],
                    Integer.valueOf(nextLine[2],
                    nextLine[3].split(','),
                    );
                scores.add(newScore);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScoreService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ScoreService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(ScoreService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return scores;
    }

}