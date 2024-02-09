package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypack.model.Child;
@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {

}
