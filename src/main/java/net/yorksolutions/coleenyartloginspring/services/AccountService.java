package net.yorksolutions.coleenyartloginspring.services;

import net.yorksolutions.coleenyartloginspring.models.Account;
import net.yorksolutions.coleenyartloginspring.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository repository;

    @Autowired
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Iterable<Account> getAllAccounts() {
        return repository.findAll();
    }

    public void addNewAccount(Account account) {
        repository.save(account);
    }

    public void updateAccount(Long id, Account account) {
        final var user = repository.findById(id).orElseThrow();
        if (account.email != null) {
            user.email = account.email;
        }
        if (account.password != null) {
            user.password = account.password;
        }

        repository.save(user);
    }

    public boolean deleteById(long id) {
        if(repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }
}
