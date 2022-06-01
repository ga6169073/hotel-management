package com.example.hotel.controller.admin;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.hotel.domain.AppRole;
import com.example.hotel.domain.AppUser;
import com.example.hotel.domain.Room;
import com.example.hotel.repository.AppUserRepository;
import com.example.hotel.service.AppUserService;

@Controller
@RequestMapping("admin/accounts")
public class AccountController {
	@Autowired(required = false)
	AppUserService appUserService;

	@GetMapping("search")
	public String search(ModelMap model, @RequestParam(name = "userName", required = false) String userName,
			@RequestParam(name = "userRole", required = false) String userRole) {

		List<AppUser> list = null;

		if (StringUtils.hasText(userName)) {
			list = appUserService.findByUserNameContaining(userName);
		} else if (StringUtils.hasText(userRole)) {
			list = appUserService.findRole(userRole);
		} else {
			list = appUserService.findAll();
		}
		model.addAttribute("accounts", list);
		return "admin/accounts/search";
	}


}