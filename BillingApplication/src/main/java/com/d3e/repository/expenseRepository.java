package com.d3e.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d3e.entity.Expense;

@Repository
public interface expenseRepository extends JpaRepository<Expense, Integer> {

	

	

	Optional<Expense> findAllByPid(String pid);

}
