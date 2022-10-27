package net.yorksolutions.coleenyartloginspring.repositories;

import net.yorksolutions.coleenyartloginspring.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
}
