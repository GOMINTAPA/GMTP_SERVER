package hello.gmtp_server.controller;

import hello.gmtp_server.dto.user.request.UserRegisterRequest;
import hello.gmtp_server.dto.user.response.UserListResponse;
import hello.gmtp_server.service.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public List<UserListResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/register/user")
    public void registerUser(@RequestBody UserRegisterRequest request) {
        userService.registerUser(request);
    }
}
