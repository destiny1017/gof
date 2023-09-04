package example.gof.structural_pattern.adapter;

import example.gof.structural_pattern.adapter.security.LoginHandler;
import example.gof.structural_pattern.adapter.security.UserDetails;
import example.gof.structural_pattern.adapter.security.UserDetailsService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountUserDetailsServiceTest {

    @Test
    void test() {
        UserDetailsService userDetailsService = new AccountUserDetailsService(new AccountService());
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        loginHandler.login("name", "name");

    }

}