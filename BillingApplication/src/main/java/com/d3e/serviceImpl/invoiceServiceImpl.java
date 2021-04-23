package com.d3e.serviceImpl;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d3e.entity.Invoice;
import com.d3e.repository.invoiceRepository;
import com.d3e.service.invoiceService;

@Service
public class invoiceServiceImpl implements invoiceService {
	
	@Autowired
	private invoiceRepository invoiceRepository;

	
	@Transactional
	public Invoice saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		Invoice saveInvoice = invoiceRepository.save(invoice);
		return saveInvoice;
		
	}

	@Transactional
	public Invoice getInvoice(Long id) {
		// TODO Auto-generated method stub
		Optional<Invoice> invoice = invoiceRepository.findById(id);
		Invoice getResponse = invoice.get();
		return getResponse;
	}
	
	
	

}
