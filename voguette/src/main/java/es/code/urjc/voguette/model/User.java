package es.code.urjc.voguette.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<Article> favoriteArticles;

    public User(String username){
        this.username = username;
        this.favoriteArticles = new ArrayList<>();
    }
    
    
}
