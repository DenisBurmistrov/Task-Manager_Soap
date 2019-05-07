package ru.burmistrov.soapTM.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.burmistrov.soapTM.entity.CustomUser;
import ru.burmistrov.soapTM.entity.User;
import ru.burmistrov.soapTM.entity.enumerated.Role;
import ru.burmistrov.soapTM.repository.IUserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("userDetailsService")
public class UserDetailsServiceBean implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        final User user = findByLogin(username);

        if (user == null) throw new UsernameNotFoundException("User not found");
        List<Role> roles = new ArrayList<>();
        roles.add(user.getRole());
        CustomUser customUser = new CustomUser
                (username, Objects.requireNonNull(user.getPassword()),roles);
        customUser.setUser(user);
        System.out.println(customUser);
        return customUser;
    }

    private User findByLogin(String username) {
        if(username == null || username.isEmpty()) return null;
        return userRepository.findOneByLogin(username);
    }
}
