package com.d3e.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d3e.entity.Expense;
import com.d3e.repository.expenseRepository;
import com.d3e.service.expenseService;

@Service
public class expenseServiceImpl implements expenseService {
	@Autowired
	private expenseRepository expenseRepository;

	
	@Transactional
	public Expense getExpense(String pid) {
		Optional<Expense> response = expenseRepository.findAllByPid(pid);
		Expense getResponse = response.get();
		return getResponse;
	}

	
	@Transactional
	public List<Expense> getAllExpense() {
		// TODO Auto-generated method stub
		
		List<Expense> Allexpenses = expenseRepository.findAll();		
		return Allexpenses;
	}

}
