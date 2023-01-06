package javangblog.springangularblog.service;

import javangblog.springangularblog.dto.RegisterRequest;
import javangblog.springangularblog.model.BlogUser;
import javangblog.springangularblog.repository.AuthUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;

@Service
public class AuthService {

    @Autowired
    private AuthUserRepository authUserRepository;

    public ResponseEntity signUp(RegisterRequest registerRequest) {
        BlogUser user = new BlogUser();
        user.setUserName(registerRequest.getUserName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        authUserRepository.save(user);
        return new ResponseEntity(HttpStatus.OK);
    }
}
