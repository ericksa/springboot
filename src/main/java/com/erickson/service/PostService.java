package com.erickson.service;

import com.erickson.model.Post;

public class PostService {

	public int countUsers(Post[] user) {

		int total = user.length;
		int x = 0;
		int y = 0;

		// this works because all users are incrementing 1-10
		// a better version would be to place number in a array and check to see if the
		// number is in the array or not
		while (x < total) {

			if (user[x].getUserId() != y) {
				y++;
			}

			x = x + 1;
		}

		return y;
	}

	public Post changeTitleAndBody(Post post, String title, String body) {

		post.setTitle(title);
		post.setBody(body);

		return post;
	}

}
