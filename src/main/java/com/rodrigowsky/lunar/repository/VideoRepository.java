package com.rodrigowsky.lunar.repository;

import com.rodrigowsky.lunar.entities.Video;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends MongoRepository<Video,String> {
}
