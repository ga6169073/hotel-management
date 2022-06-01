package com.example.hotel.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.example.hotel.domain.AppUser;


public interface AppUserService {
	AppUser getById(Long id);

	Optional<AppUser> findById(Long id);

	List<AppUser> findAllById(Iterable<Long> ids);

	List<AppUser> findAll(Sort sort);

	Page<AppUser> findAll(Pageable pageable);

	List<AppUser> findAll();
	 
	List<AppUser> findByUserNameContaining(String userName);

	Page<AppUser> findByUserNameContaining(String userName, Pageable pageable);
	
	List<AppUser> findRole(String roleName);

}
