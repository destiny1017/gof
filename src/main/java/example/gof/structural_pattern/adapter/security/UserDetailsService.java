package example.gof.structural_pattern.adapter.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
