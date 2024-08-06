package hello.gmtp_server.service.feed;

import hello.gmtp_server.domain.Feed;
import hello.gmtp_server.domain.FeedRepository;
import hello.gmtp_server.dto.feed.request.SolveFeedRequest;
import hello.gmtp_server.dto.feed.request.VoteFeedRequest;
import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import hello.gmtp_server.dto.feed.response.FeedListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FeedService {

    FeedRepository feedRepository;

    public FeedService(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

    public void writeFeed(WriteFeedRequest request) {
        Feed feed = new Feed(request.getTitle(), request.getContent(), request.getFirstOption(), request.getSecondOption(), request.getImageId(), request.getKeyword(), request.isSolve());
        feedRepository.save(feed);
    }

    public void voteFeed(VoteFeedRequest request) {
        Feed feed = feedRepository.findById(request.getFeedId()).orElseThrow(IllegalArgumentException::new);
        feed.setVoteNum();
        feedRepository.save(feed);
    }

    public void solveFeed(SolveFeedRequest request) {
        Feed feed = feedRepository.findById(request.getFeedId()).orElseThrow(IllegalArgumentException::new);
        feed.setSolve();
        feedRepository.save(feed);
    }

    public List<FeedListResponse> showFeedList() {
        List<Feed> feedList = feedRepository.findAll();
        List<FeedListResponse> feedListResponses = new ArrayList<>();
        for (int i = 0; i < feedList.size(); i++) {
            Feed feed = feedList.get(i);
            FeedListResponse feedListResponse = new FeedListResponse(feed.getTitle(), feed.getContent(), feed.getFirstOption(), feed.getSecondOption(), feed.getImageId(), feed.getKeyword());
            feedListResponses.add(feedListResponse);
        }
        return feedListResponses;
    }

    public List<FeedListResponse> showSolvedFeedList() {
        List<Feed> feedList = feedRepository.findBySolve(true);
        List<FeedListResponse> feedListResponses = new ArrayList<>();
        for (int i = 0; i < feedList.size(); i++) {
            Feed feed = feedList.get(i);
            FeedListResponse response = new FeedListResponse(feed.getTitle(), feed.getContent(), feed.getFirstOption(), feed.getSecondOption(), feed.getImageId(), feed.getKeyword());
            feedListResponses.add(response);
        }
        return feedListResponses;
    }
}
