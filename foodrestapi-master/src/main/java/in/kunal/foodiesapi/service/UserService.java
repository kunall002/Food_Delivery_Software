package in.kunal.foodiesapi.service;

import in.kunal.foodiesapi.io.UserRequest;
import in.kunal.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
