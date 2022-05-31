package com.example.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotel.domain.AppUser;
import com.example.hotel.domain.UserRole;

public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	List<UserRole> findByAppUser(AppUser appUser); 
}
