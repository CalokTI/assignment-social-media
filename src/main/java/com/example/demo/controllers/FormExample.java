package com.example.demo.controllers;

import com.example.demo.models.Post;
import com.example.demo.services.PostsServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;


@Controller
public class FormExample {

    PostsServices postsServices = new PostsServices();

    //Home Page
    @GetMapping("/")
    public String renderIndex(Model model){
        model.addAttribute("posts", postsServices.getPostArrayList());
        return "index.html";
    }

    @PostMapping(value = "/submit")
    public String redirectForm(@RequestParam(name = "title") String title, @RequestParam(name = "content") String content,
                               @RequestParam(name = "public") String isPublic, HttpServletRequest request){
        HttpSession session = request.getSession();
        ArrayList<Post> posts = (ArrayList<Post>) session.getAttribute("sessionPosts");
        if (posts == null) {
            posts = new ArrayList<>();
        }
        Post post = new Post(title, content, isPublic);
        postsServices.addPostToArrayList(post);
        posts.add(post);
        session.setAttribute("sessionPosts", posts);
        return "redirect:/";
    }
}
