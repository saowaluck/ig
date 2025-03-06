package com.odds.ig.controller;

import com.odds.ig.model.response.FeedResponse;
import com.odds.ig.service.FeedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class FeedController {

    private final FeedService feedService;

    FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @GetMapping("/feed")
    public ArrayList<FeedResponse> getFeed() {
        return this.feedService.getFeed();
    }
}
