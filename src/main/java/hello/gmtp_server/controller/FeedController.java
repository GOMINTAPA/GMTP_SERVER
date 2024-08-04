package hello.gmtp_server.controller;

import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import hello.gmtp_server.service.FeedService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeedController {

    private FeedService feedService;

    public FeedController(FeedService feedService) {
        this.feedService = feedService;
    }

    @PostMapping("/feed/write")
    public void writeFeed(@RequestBody WriteFeedRequest request) {
        feedService.writeFeed(request);
    }
}
