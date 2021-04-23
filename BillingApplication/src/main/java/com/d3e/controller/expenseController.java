package com.d3e.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d3e.entity.Expense;
import com.d3e.service.expenseService;
@RestController
@RequestMapping("/expense")
public class expenseController {
	@Autowired
	private expenseService expenseService;
	
	@GetMapping("/{pid}")
	public Expense getExpense(@PathVariable String pid) {
		Expense expense = expenseService.getExpense(pid);
		return expense;
	}
	
	@GetMapping("/All")
	public List<Expense> getAll(){
		List<Expense> AllExpenses = expenseService.getAllExpense();
		return AllExpenses;
		
	}
	
	
}
