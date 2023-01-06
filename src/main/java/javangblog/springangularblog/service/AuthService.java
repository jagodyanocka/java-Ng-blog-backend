package javangblog.springangularblog.service;

import javangblog.springangularblog.dto.RegisterRequest;
import javangblog.springangularblog.model.BlogUser;
import javangblog.springangularblog.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;

@Service
public class AuthService {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthUserRepository authUserRepository;

    public void signUp(RegisterRequest registerRequest) {
        BlogUser user = new BlogUser();
        user.setUserName(registerRequest.getUserName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodePassword(registerRequest.getPassword()));
        authUserRepository.save(user);

    }

    private String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

}
