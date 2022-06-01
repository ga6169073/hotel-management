package com.example.hotel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hotel.domain.AppRole;
import com.example.hotel.domain.AppUser;
import com.example.hotel.domain.UserRole;
@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>{
	List<UserRole> findByAppUser(AppUser appUser); 
	List<UserRole> findByAppRole(AppRole appRole);
}
