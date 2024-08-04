package hello.gmtp_server.service.feed;

import hello.gmtp_server.domain.Feed;
import hello.gmtp_server.domain.FeedRepository;
import hello.gmtp_server.dto.feed.request.WriteFeedRequest;
import org.springframework.stereotype.Service;

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
}
