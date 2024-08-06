package hello.gmtp_server.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private String firstOption;

    private String secondOption;

    private int imageId;

    private String keyword;

    private boolean solve;

    private int voteNum;

    public Feed() {
    }

    public Feed(String title, String content, String firstOption, String secondOption, int imageId, String keyword, boolean solve) {
        this.title = title;
        this.content = content;
        this.firstOption = firstOption;
        this.secondOption = secondOption;
        this.imageId = imageId;
        this.keyword = keyword;
        this.solve = solve;
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

    public boolean isSolve() {
        return solve;
    }

    public int getVoteNum() {
        return voteNum;
    }

    public void setVoteNum() {
        this.voteNum ++;
    }
}
