package hello.gmtp_server.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identifier;
    private String password;
    private String nickName;

    public User() {
    }

    public User(String identifier, String password, String nickName) {
        this.identifier = identifier;
        this.password = password;
        this.nickName = nickName;
    }

}
