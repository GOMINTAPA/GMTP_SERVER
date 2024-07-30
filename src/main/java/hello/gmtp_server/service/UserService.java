package hello.gmtp_server.service;

import hello.gmtp_server.domain.User;
import hello.gmtp_server.domain.UserRepository;
import hello.gmtp_server.dto.user.request.UserRegisterRequest;
import hello.gmtp_server.dto.user.response.UserListResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserListResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserListResponse> userListResponses = new ArrayList<>();
        UserListResponse userListResponse;
        for (int i = 0; i < users.size(); i++) {
            userListResponse = new UserListResponse(users.get(i).getId(), users.get(i).getIdentifier(), users.get(i).getPassword(), users.get(i).getNickName());
            userListResponses.add(userListResponse);
        }
        return userListResponses;
    }

    public void registerUser(UserRegisterRequest request) {
        User user = new User(request.getIdentifier(), request.getPassword(), request.getNickName());
        userRepository.save(user);
    }
}
