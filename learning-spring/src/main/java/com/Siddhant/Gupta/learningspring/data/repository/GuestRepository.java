package com.Siddhant.Gupta.learningspring.data.repository;

import com.Siddhant.Gupta.learningspring.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
