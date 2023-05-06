package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplUserService;
import com.kings.rentacarrest.model.dto.UserLogInDTO;
import com.kings.rentacarrest.persistence.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class AuthController {
    private final ImplUserService userService;

    @PostMapping("/auth")
    public User authUser(@RequestBody UserLogInDTO user) throws DefaultException {
        return this.userService.authUser(user);
    }

}
