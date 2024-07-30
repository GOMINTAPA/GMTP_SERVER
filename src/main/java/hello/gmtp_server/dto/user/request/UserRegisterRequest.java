package hello.gmtp_server.dto.user.request;

public class UserRegisterRequest {

    private String identifier;
    private String password;
    private String nickName;

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
