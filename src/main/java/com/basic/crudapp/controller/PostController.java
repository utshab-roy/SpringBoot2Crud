package com.basic.crudapp.controller;

import com.basic.crudapp.dao.PostRepo;
import com.basic.crudapp.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @Autowired
    PostRepo repo;

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/addPost")
    public String addPost(Post post) {
        repo.save(post);
        return "home";
    }
}
