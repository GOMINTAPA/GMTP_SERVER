package hello.gmtp_server.service.feed;

import hello.gmtp_server.domain.Feed;
import hello.gmtp_server.domain.FeedRepository;
import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import hello.gmtp_server.dto.feed.response.FeedListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FeedService {

    FeedRepository feedRepository;

    public FeedService(FeedRepository feedRepository) {
        this.feedRepository = feedRepository;
    }

    public void writeFeed(WriteFeedRequest request) {
        Feed feed = new Feed(request.getTitle(), request.getContent(), request.getFirstOption(), request.getSecondOption(), request.getImageId(), request.getKeyword());
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
}
