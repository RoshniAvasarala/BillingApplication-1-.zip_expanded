package com.d3e.service;

import org.springframework.stereotype.Component;

import com.d3e.entity.Invoice;

@Component
public interface invoiceService {
	public Invoice saveInvoice(Invoice invoice);
	public Invoice getInvoice(Long id);

}
