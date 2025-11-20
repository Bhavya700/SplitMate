package com.splitmate.repository;

import com.splitmate.entity.Expense;
import com.splitmate.entity.Group;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ExpenseRepository extends JpaRepository<Expense, UUID> {

    List<Expense> findAllByGroup(Group group);
}
