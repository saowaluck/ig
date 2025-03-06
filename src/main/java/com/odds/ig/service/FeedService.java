package com.odds.ig.service;

import com.odds.ig.model.response.FeedResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FeedService {
    public ArrayList<FeedResponse> getFeed() {
        var feed1 = new FeedResponse();
        feed1.setTitle("Feed1");
        feed1.setId(1);
        feed1.setImageUrl("http://www.odds.com/images/feed1.png");

        var feedList = new ArrayList<FeedResponse>();
        feedList.add(feed1);

        return feedList;
    }
}
