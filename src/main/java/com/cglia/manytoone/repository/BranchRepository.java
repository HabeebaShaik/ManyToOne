package com.cglia.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.manytoone.model.Branch;
@Repository
public interface BranchRepository extends JpaRepository<Branch, Integer>{

}
