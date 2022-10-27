package net.yorksolutions.coleenyartloginspring.controllers;

import net.yorksolutions.coleenyartloginspring.models.Account;
import net.yorksolutions.coleenyartloginspring.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService service;

    @Autowired
    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    Iterable<Account> getAll() {
        return service.getAllAccounts();
    }

    @PostMapping
    void addNewUser(@RequestBody Account account) {
        service.addNewAccount(account);
    }

    @PutMapping
    public void updateAccount(@RequestParam Long id, @RequestBody Account account) {
        service.updateAccount(id, account);
    }

    @DeleteMapping("{id}")
    String deleteById(@PathVariable long id) {
        return service.deleteById(id) ? "Success" : "Fail";
    }


}
