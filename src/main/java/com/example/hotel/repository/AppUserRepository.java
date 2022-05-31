package com.example.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotel.domain.AppUser;

public interface AppUserRepository extends JpaRepository<AppUser, Long>{
	AppUser findByUserName(String userName);
}
