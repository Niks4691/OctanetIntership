package com.repository;

import java.util.List;

import javax.management.loading.ClassLoaderRepository;

import com.entity.Transaction;

public interface TransactionRepository extends ClassLoaderRepository 
{

	List<Transaction> findAll1();
    // Define custom query methods if needed

	void save(Transaction transaction);

	List<Transaction> findAll();
}
