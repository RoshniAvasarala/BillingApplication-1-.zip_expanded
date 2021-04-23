package com.d3e.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d3e.entity.Invoice;

@Repository
public interface invoiceRepository extends JpaRepository<Invoice, Serializable>{
	 Optional<Invoice> findById(Long id);
}
