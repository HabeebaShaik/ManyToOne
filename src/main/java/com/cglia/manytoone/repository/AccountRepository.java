package com.cglia.manytoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.manytoone.model.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
