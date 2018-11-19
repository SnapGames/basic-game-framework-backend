package fr.snapgames.bgf.services.score.entities;

import java.util.List;


public class Score{

    private long id;
    private String name;
    private long score;
    private List<String> accomplishments;


    public Score(long id, String name, String score, List<String> accomplishements){
        this.id = id;
        this.name = name;
        this.score = score;
        this.accomlpishments = accomlpishments;
    }

    /**
     * @return long return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return long return the score
     */
    public long getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(long score) {
        this.score = score;
    }

    /**
     * @return Map<String,String> return the accomplishments
     */
    public List<String> getAccomplishments() {
        return accomplishments;
    }

    /**
     * @param accomplishments the accomplishments to set
     */
    public void setAccomplishments(List<String> accomplishments) {
        this.accomplishments = accomplishments;
    }

}