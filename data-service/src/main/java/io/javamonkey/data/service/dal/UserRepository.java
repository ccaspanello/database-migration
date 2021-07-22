package io.javamonkey.data.service.dal;

import io.javamonkey.data.service.dao.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "users", collectionResourceRel = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long>
{
}
