package hello.gmtp_server.dto.feed.response;

public class FeedListResponse {

    String title;
    String content;
    String firstOption;
    String secondOption;
    int imageId;
    String keyword;

    public FeedListResponse(String title, String content, String firstOption, String secondOption, int imageId, String keyword) {
        this.title = title;
        this.content = content;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
        this.imageId = imageId;
        this.keyword = keyword;
    }

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
