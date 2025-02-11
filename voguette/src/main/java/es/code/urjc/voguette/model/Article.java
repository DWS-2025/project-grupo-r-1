package es.code.urjc.voguette.model;

import java.util.ArrayList;
import java.util.List;

public class Article {
    private Long id = null;
    private String user;
    private String category;
    private String title;
    private String subtitle;
    private String image;
    private String text;
    private String author;

    public Article(String user, String category, String title, String subtitle, String text, String author){
        this.user = user;
        this.category = category;
        this.title = title;
        this.subtitle = subtitle;
        this.text = text;
        this.author = author;
    }

}