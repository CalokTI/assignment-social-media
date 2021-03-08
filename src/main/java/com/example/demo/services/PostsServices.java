package com.example.demo.services;

import com.example.demo.models.Post;

import java.util.ArrayList;

/**
 * @author Carsten
 * Time: 15.50
 * Date: 25/02/2021
 */
public class PostsServices {

    private ArrayList<Post> postArrayList = new ArrayList<>();

    public PostsServices(){
        Post post = new Post("Heste-nettet.dk", "Heste-nettet ved alt! denne post er public","yes");
        postArrayList.add(post);

        post = new Post("Heste-nettet.dk", "Heste-nettet ved alt! Denne post er ikke public","no");
        postArrayList.add(post);
    }

    public void addPostToArrayList(Post post){
        postArrayList.add(post);
    }

    public ArrayList<Post> getPostArrayList() {
        return postArrayList;
    }
}
