package com.basic.crudapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PostController {
    @RequestMapping("/posts")
    public ModelAndView printPostData(Post post){
        ModelAndView mv = new ModelAndView();
//        mv.addObject("obj", post); // to change the name of the object
        mv.addObject(post);
        mv.setViewName("post");
        return mv;
    }
}
