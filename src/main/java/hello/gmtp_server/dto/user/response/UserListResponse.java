package hello.gmtp_server.dto.user.response;

import hello.gmtp_server.domain.User;

import java.util.List;

public class UserListResponse {

    long id;
    String identifier;
    String password;
    String nickName;

    public UserListResponse(long id, String identifier, String password, String nickName) {
        this.id = id;
        this.identifier = identifier;
        this.password = password;
        this.nickName = nickName;
    }

    public UserListResponse() {
    }

    public long getId() {
        return id;
    }
    public String getIdentifier() {
        return identifier;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }
}
