package net.yorksolutions.coleenyartloginspring.controllers;

import net.yorksolutions.coleenyartloginspring.models.Post;
import net.yorksolutions.coleenyartloginspring.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/post")
public class PostController {
    private final PostService service;

    @Autowired
    public PostController(PostService service) {
        this.service = service;
    }

//    @PostMapping
//    public void addNewPost(@RequestBody Post post) {
//        service.addNewPost(post);
//    }

//    @PutMapping
//    public void addPostToAccount(@RequestParam ) {
//
//    }
}
