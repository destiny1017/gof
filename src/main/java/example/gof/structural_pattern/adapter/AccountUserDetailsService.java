package example.gof.structural_pattern.adapter;

import example.gof.structural_pattern.adapter.security.UserDetails;
import example.gof.structural_pattern.adapter.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
