package com.erickson.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.erickson.model.Post;

 
@RestController
@RequestMapping(path = "/post")
public class PostControllerTest 
{
    @Autowired
    private Post[] post;
 
	@GetMapping(PostURIConstants.GET_ALL_POSTS)
	public Post[] getAll()
    {
        return post;
    }
     
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Post post) {       
                 
        //add resource
        post.setBody("test body");
        post.setId(1);
        post.setTitle("test title");
        post.setUserId(1);
         
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(post.getId())
                                    .toUri();
         
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}