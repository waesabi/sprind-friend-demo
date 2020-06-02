package com.example.springfriend.Controller;

import com.example.springfriend.Model.Friend;
import com.example.springfriend.Services.FriendServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HelloController {

    @RequestMapping("/")
    public ArrayList<Friend> index() {
        return new FriendServices().getFriends();
    }

}
