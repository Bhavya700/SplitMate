package com.splitmate.repository;

import com.splitmate.entity.ExpenseSplit;
import com.splitmate.entity.Group;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ExpenseSplitRepository extends JpaRepository<ExpenseSplit, UUID> {

    List<ExpenseSplit> findAllByExpense_Group(Group group);
}
