package com.basic.crudapp.dao;

import com.basic.crudapp.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post, Integer> {

}
