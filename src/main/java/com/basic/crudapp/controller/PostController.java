package com.basic.crudapp.controller;

import com.basic.crudapp.dao.PostRepo;
import com.basic.crudapp.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {

    @Autowired
    PostRepo repo;

    @RequestMapping("/")
    public String home() {
        return "post/home";
    }

    @RequestMapping("/addPost")
    public String addPost(Post post) {
        repo.save(post);
        return "post/home";
    }

    @RequestMapping("/getPost")
    public ModelAndView addPost(@RequestParam int id) {
        // setting the view name using constructor
        ModelAndView mv = new ModelAndView("/post/show");
        // orElse part is there because to handel the null value, or we could make it optional
        Post post = repo.findById(id).orElse(new Post());
        mv.addObject(post);
        return mv;
    }

    @RequestMapping("/getAllPosts")
    public ModelAndView allPost() {
        // setting the view name using constructor
        ModelAndView mv = new ModelAndView("/post/index");
        Iterable<Post> posts = repo.findAll();
        mv.addObject("posts", posts);
        return mv;
    }

    @RequestMapping(value = "/posts/{id}/show", method = RequestMethod.GET)
    public ModelAndView showPost(@PathVariable("id") int id) {
        // setting the view name using constructor
        ModelAndView mv = new ModelAndView("/post/show");
        Post post = repo.findById(id).orElse(new Post());
        mv.addObject("post", post);
        return mv;
    }
}
