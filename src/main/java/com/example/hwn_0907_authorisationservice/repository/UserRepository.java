package com.example.hwn_0907_authorisationservice.repository;

import com.example.hwn_0907_authorisationservice.service.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password) {
        List<Authorities> authorities = new ArrayList<>();
        if ("adm".equals(user) && "11114444".equals(password)) {
            authorities.add(Authorities.READ);
            authorities.add(Authorities.WRITE);
            authorities.add(Authorities.DELETE);
        }
        return authorities;
    }
}
