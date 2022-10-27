package net.yorksolutions.coleenyartloginspring.services;

import net.yorksolutions.coleenyartloginspring.models.Post;
import net.yorksolutions.coleenyartloginspring.repositories.AccountRepository;
import net.yorksolutions.coleenyartloginspring.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository repository;
    private final AccountRepository accountRepository;

    @Autowired
    public PostService(PostRepository repository, AccountRepository accountRepository) {
        this.repository = repository;
        this.accountRepository = accountRepository;
    }

//    public void addNewPost(Post post) {
//        repository.save(new Post(post));
//    }
}
