package spring.jwt.service;

import spring.jwt.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
    
}
