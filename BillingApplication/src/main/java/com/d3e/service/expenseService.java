package com.d3e.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.d3e.entity.Expense;

@Component
public interface expenseService {
	public Expense getExpense(String pid);
	public List<Expense> getAllExpense();
}
