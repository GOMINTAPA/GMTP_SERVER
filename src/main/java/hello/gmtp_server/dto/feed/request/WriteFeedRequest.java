package hello.gmtp_server.dto.feed.request;

public class WriteFeedRequest {

    String title;
    String content;
    String firstOption;
    String secondOption;
    int imageId;
    String keyword;

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getFirstOption() {
        return firstOption;
    }

    public String getSecondOption() {
        return secondOption;
    }

    public int getImageId() {
        return imageId;
    }

    public String getKeyword() {
        return keyword;
    }
}
