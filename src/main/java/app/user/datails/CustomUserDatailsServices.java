package app.user.datails;

import app.user.User;
import app.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDatailsServices implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String kra) throws UsernameNotFoundException {
        User user = userRepository.finndByKra(kra);

        if (user == null){
            throw new UsernameNotFoundException("Nie znaleźono użytkownika");
        }
        return new CustomUserDetails(user);
    }
}
