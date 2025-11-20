package com.splitmate.repository;

import com.splitmate.entity.Group;
import com.splitmate.entity.GroupMembership;
import com.splitmate.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface GroupMembershipRepository extends JpaRepository<GroupMembership, UUID> {

    boolean existsByUserAndGroup(User user, Group group);

    List<GroupMembership> findByGroup(Group group);

    List<GroupMembership> findByUser(User user);

    
}
