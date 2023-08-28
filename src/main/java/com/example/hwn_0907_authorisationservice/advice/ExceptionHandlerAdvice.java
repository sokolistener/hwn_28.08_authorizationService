package com.example.hwn_0907_authorisationservice.advice;

import com.example.hwn_0907_authorisationservice.exception.InvalidCredentials;
import com.example.hwn_0907_authorisationservice.exception.UnauthorizedUser;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
    @ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String> invalidCredentialsHandler(InvalidCredentials error) {
        return new ResponseEntity<>(error.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String> unAuthorizedUserHandler (UnauthorizedUser error) {
        return new ResponseEntity<>(error.getMessage(), HttpStatus.UNAUTHORIZED);
    }
}
