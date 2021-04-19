package com.erickson.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.erickson.model.Post;
import com.erickson.service.PostService;


@RestController
class PostController {

	
	@GetMapping(PostURIConstants.FOURTH_POST)
	public Post updatedUserList() {
		RestTemplate restTemplete = new RestTemplate();
		ResponseEntity<Post> response = restTemplete.getForEntity("https://jsonplaceholder.typicode.com/posts/4",
				Post.class);
		Post user = response.getBody();
		PostService changePost = new PostService();
		String flowers = "1800Flowers";
		return changePost.changeTitleAndBody(user, flowers, flowers);

	}
	
	@GetMapping(PostURIConstants.COUNT_USERS)
	public int count() {
		RestTemplate restTemplete3 = new RestTemplate();
		ResponseEntity<Post[]> response = restTemplete3.getForEntity("https://jsonplaceholder.typicode.com/posts",
				Post[].class, HttpStatus.OK);
		Post[] user = response.getBody();
		PostService count = new PostService();
		int result = count.countUsers(user);
		return result;

	}

	@GetMapping(PostURIConstants.GET_ALL_POSTS)
	public Post[] getAll() {
		RestTemplate getAll = new RestTemplate();

		ResponseEntity<Post[]> response = getAll.getForEntity("https://jsonplaceholder.typicode.com/posts",
				Post[].class);
		Post[] all = response.getBody();

		return all;
	}
	

}
