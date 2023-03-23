package com.codercampus.Assignment11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepo;
	
	public Transaction findById(Integer transactionId) {
		return transactionRepo.findById(transactionId);
				
	}

	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return transactionRepo.findAll();
	}
}
