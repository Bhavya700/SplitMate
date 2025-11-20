package com.splitmate.controller;

import com.splitmate.dto.CreateExpenseRequest;
import com.splitmate.dto.ExpenseResponse;
import com.splitmate.dto.ExpenseSummary;
import com.splitmate.entity.User;
import com.splitmate.service.ExpenseService;
import com.splitmate.util.AuthUtil;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @PostMapping
    public ResponseEntity<ExpenseResponse> createExpense(@RequestBody @Valid CreateExpenseRequest request) {
        User currentUser = AuthUtil.getCurrentUser();
        return ResponseEntity.ok(expenseService.createExpense(request, currentUser));
    }

    @GetMapping("/group/{groupId}")
    public ResponseEntity<List<ExpenseSummary>> getGroupExpenses(@PathVariable UUID groupId) {
        User currentUser = AuthUtil.getCurrentUser();
        return ResponseEntity.ok(expenseService.getExpensesByGroup(groupId, currentUser));
    }

}
