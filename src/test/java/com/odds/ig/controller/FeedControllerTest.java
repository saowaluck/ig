package com.odds.ig.controller;

import com.odds.ig.model.response.FeedResponse;
import com.odds.ig.service.FeedService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FeedControllerTest {

    @Mock
    private FeedService feedService;

    @InjectMocks
    private FeedController controller;

    @Test
    void shouldReturnFeed() {
        var feed = new FeedResponse();
        feed.setTitle("Feed1");
        var feedResponses = new ArrayList<FeedResponse>();
        feedResponses.add(feed);
        when(feedService.getFeed()).thenReturn(feedResponses);

        var response = controller.getFeed();

        verify(feedService, times(1)).getFeed();
        assertEquals(1, response.size());
        assertEquals("Feed1", response.getFirst().getTitle());

    }
}