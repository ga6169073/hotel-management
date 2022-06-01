package com.example.hotel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hotel.domain.AppUser;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	AppUser findByUserName(String userName);

	List<AppUser> findByUserNameContaining(@Param("userName") String userName);

	Page<AppUser> findByUserNameContaining(@Param("userName") String userName, Pageable pageable);
	
	@Query(value ="select * from app_user where user_id in (select user_id from user_role where role_id = ( select role_id from app_role where role_name = roleName))"
			+ "", nativeQuery = true)
	List<AppUser> findRole(@Param("roleName") String roleName);
	
}
