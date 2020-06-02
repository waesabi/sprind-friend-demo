package com.example.springfriend.Services;

import com.example.springfriend.Model.Friend;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FriendServices {
    private final ArrayList<Friend> friends = new ArrayList<>();
    public FriendServices() {
        Friend john = new Friend();
        john.setName("John");
        john.setAge(50);
        john.setMobileNo(1234566);

        Friend hhh = new Friend();
        hhh.setName("HHH");
        hhh.setAge(55);
        hhh.setMobileNo(64566456);

        Friend undertaker = new Friend();
        undertaker.setName("Undertaker");
        undertaker.setAge(65);
        undertaker.setMobileNo(67567654);

        friends.add(john);
        friends.add(hhh);
        friends.add(undertaker);
    }

    public ArrayList<Friend> getFriends() {
        return this.friends;
    }
}
