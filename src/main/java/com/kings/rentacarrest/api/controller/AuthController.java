package com.kings.rentacarrest.api.controller;

import com.kings.rentacarrest.core.exception.DefaultException;
import com.kings.rentacarrest.core.services.ImplUserService;
import com.kings.rentacarrest.model.dto.UserLogIn;
import com.kings.rentacarrest.persistence.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class AuthController {
    private final ImplUserService userService;

    @PostMapping("/auth")
    public User authUser(@RequestBody UserLogIn user) throws DefaultException {
        return this.userService.authUser(user);
    }

}
