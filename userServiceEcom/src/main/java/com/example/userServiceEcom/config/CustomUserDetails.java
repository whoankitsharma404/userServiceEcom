package com.example.userServiceEcom.config;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.userServiceEcom.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomUserDetails extends User implements UserDetails {

    public CustomUserDetails(User user){
        super(user);
//        System.out.println(user.getEmail());
//        System.out.println(user.getPassword());

    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorityList=new ArrayList<>();
        super.getRoles().forEach(role->{
            authorityList.add(new SimpleGrantedAuthority(role.getName()));
        });

        return authorityList;
    }


    @Override
    public String getUsername() {
//        System.out.println(super.getEmail());
        return super.getEmail();
    }
    @Override
    public String getPassword() {
//        System.out.println(super.getPassword());
        return super.getPassword();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
