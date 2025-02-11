package es.code.urjc.voguette.model;

public class Comment {
    private Long id = null;
    private String user;
    private String text;
    private int score;

    public Comment(){
    }

    public Comment(String user, String text, int score){
        this.user = user;
        this.text = text;
        this.score = score;
    }

    

}
