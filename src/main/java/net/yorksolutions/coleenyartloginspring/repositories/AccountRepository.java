package net.yorksolutions.coleenyartloginspring.repositories;

import net.yorksolutions.coleenyartloginspring.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {
}
