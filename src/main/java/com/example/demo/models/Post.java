package com.example.demo.models;

import java.time.LocalDate;


/**
 * @author Carsten
 * Time: 14.28
 * Date: 25/02/2021
 */
public class Post {
    private String title;
    private String content;
    private boolean isPublic;

    public Post(String title, String content){
        this.title = title;
        this.content = content;
    }

    public Post(String title, String content, String isPublic) {
        this.title = title;
        this.content = content;
        if(isPublic.equalsIgnoreCase("yes")){
            this.isPublic = true;
        }
        else {
            this.isPublic = false;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isPublic() {
        return isPublic;
    }
}
