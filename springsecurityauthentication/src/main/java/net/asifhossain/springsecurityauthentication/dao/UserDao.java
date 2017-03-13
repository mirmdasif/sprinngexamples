package net.asifhossain.springsecurityauthentication.dao;


import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

/**
 * @author asif.hossain
 * @since 3/9/17.
 */
@Repository
public class UserDao implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        String password = readPasswordFromFileOrDatabase(username);

        if (password == null) throw new UsernameNotFoundException("");

        return User
                .withUsername(username)
                .password(password)
                .authorities("ROLE_USER")
                .build();
    }

    private String readPasswordFromFileOrDatabase(String username) {
        if (username.equals("user")) return "password";
        return null;
    }
}
