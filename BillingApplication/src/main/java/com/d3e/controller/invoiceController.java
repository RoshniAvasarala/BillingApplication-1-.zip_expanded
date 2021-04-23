package com.d3e.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d3e.entity.Invoice;
import com.d3e.service.invoiceService;

@RestController
@RequestMapping("/invoice")
public class invoiceController {
	
	@Autowired
	private invoiceService invoiceService;
	
	@GetMapping("/{id}")
	public Invoice getInvoice(long id) {
		Invoice invoice = invoiceService.getInvoice(id);
		return invoice;
		
	}
	
	@PostMapping("/save")
	public Invoice saveInvoice(Invoice invoice) {
		Invoice saveInvoice = invoiceService.saveInvoice(invoice);
		return saveInvoice;
	}
	
}
