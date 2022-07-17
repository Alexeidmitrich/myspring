package com.example.MyWorkSpring.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    User;

    @Override
    public String getAuthority() {
        return name();
    }
}
