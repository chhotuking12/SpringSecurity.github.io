package com.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mypack.model.Parent;
import java.util.List;

@Repository
public interface ParentRepository extends JpaRepository<Parent,Long> {
		Parent getByEmail(String email);
}
