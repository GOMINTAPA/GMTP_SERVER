package hello.gmtp_server.controller;

import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import hello.gmtp_server.dto.feed.response.FeedListResponse;
import hello.gmtp_server.service.feed.FeedService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/feed/list")
    public List<FeedListResponse> feedList() {
        List<FeedListResponse> feedListResponses = feedService.showFeedList();
        return feedListResponses;
    }
}
