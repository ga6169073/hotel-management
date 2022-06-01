package com.example.hotel.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.hotel.domain.AppUser;
import com.example.hotel.repository.AppUserRepository;
import com.example.hotel.service.AppUserService;

@Service
public class AppUserServiceImpl implements AppUserService{
	@Autowired
	AppUserRepository appUserRepository;
	
	public AppUserServiceImpl(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}
	
	@Override
	public AppUser getById(Long id) {
		return appUserRepository.getById(id);
	}

	@Override
	public Optional<AppUser> findById(Long id) {
		return appUserRepository.findById(id);
	}

	@Override
	public List<AppUser> findAllById(Iterable<Long> ids) {
		return appUserRepository.findAllById(ids);
	}

	@Override
	public List<AppUser> findAll(Sort sort) {
		return appUserRepository.findAll(sort);
	}

	@Override
	public Page<AppUser> findAll(Pageable pageable) {
		return appUserRepository.findAll(pageable);
	}

	@Override
	public List<AppUser> findAll() {
		return appUserRepository.findAll();
	}

	@Override
	public Page<AppUser> findByUserNameContaining(String userName, Pageable pageable) {
		
		return appUserRepository.findByUserNameContaining(userName, pageable);
	}
	@Override
	public List<AppUser> findByUserNameContaining(String userName) {
		return appUserRepository.findByUserNameContaining(userName);
	}

	@Override
	public List<AppUser> findRole(String roleName) {
		return appUserRepository.findRole(roleName);
	}

	
}
