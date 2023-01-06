package javangblog.springangularblog.controller;

import javangblog.springangularblog.dto.RegisterRequest;
import javangblog.springangularblog.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;


    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody RegisterRequest registerRequest) {
         authService.signUp(registerRequest);
         return new ResponseEntity(HttpStatus.OK);
    }
}
