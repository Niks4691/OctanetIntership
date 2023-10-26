package com.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.entity.Transaction;
import com.service.TransactionService;

@Controller
public class ATMController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/")
    public String showHomePage(Model model) {
        // Load the user's account balance and transaction history
        // You can retrieve this data from your ATM system or database
        model.addAttribute("balance", 1000.0); // Example balance
        model.addAttribute("transactions", transactionService.getAllTransactions());
        return "home";
    }

    @PostMapping("/deposit")
    public String deposit(@RequestParam Double amount) {
        // Handle deposit logic and add a record to the transaction history
        Transaction depositTransaction = new Transaction();
        depositTransaction.setType("Deposit");
        depositTransaction.setAmount(amount);
        transactionService.addTransaction(depositTransaction);
        return "redirect:/";
    }

    @PostMapping("/withdraw")
    public String withdraw(@RequestParam Double amount) {
        // Handle withdraw logic and add a record to the transaction history
        Transaction withdrawTransaction = new Transaction();
        withdrawTransaction.setType("Withdraw");
        withdrawTransaction.setAmount(amount);
        transactionService.addTransaction(withdrawTransaction);
        return "redirect:/";
    }

    @PostMapping("/transfer")
    public String transfer(@RequestParam Double amount, @RequestParam String recipient) {
        // Handle transfer logic and add records to the transaction history
        Transaction transferTransaction = new Transaction();
        transferTransaction.setType("Transfer");
        transferTransaction.setAmount(amount);
        transactionService.addTransaction(transferTransaction);
        return "redirect:/";
    }
}
