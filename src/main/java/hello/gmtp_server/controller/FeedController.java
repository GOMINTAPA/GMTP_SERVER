package hello.gmtp_server.controller;

import hello.gmtp_server.dto.feed.request.SolveFeedRequest;
import hello.gmtp_server.dto.feed.request.VoteFeedRequest;
import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import hello.gmtp_server.dto.feed.response.FeedListResponse;
import hello.gmtp_server.service.feed.FeedService;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/feed/vote")
    public void voteFeed(@RequestBody VoteFeedRequest request) {
        feedService.voteFeed(request);
    }

    @PutMapping("/feed/solve")
    public void solveFeed(@RequestBody SolveFeedRequest request) {
        feedService.solveFeed(request);
    }

    @GetMapping("/feed/list")
    public List<FeedListResponse> feedList() {
        List<FeedListResponse> feedListResponses = feedService.showFeedList();
        return feedListResponses;
    }

    @GetMapping("/feed/solvedList")
    public List<FeedListResponse> feedSolvedList() {
        List<FeedListResponse> feedListResponses = feedService.showSolvedFeedList();
        return feedListResponses;
    }
}
