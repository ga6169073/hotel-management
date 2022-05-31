package com.example.hotel.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.hotel.domain.Room;
import com.example.hotel.service.RoomService;

@Controller
@RequestMapping("site/bookings")
public class BookingCotroller {
	
	@Autowired(required = false)
	RoomService roomService;
	
//	CustomerService customerService;
	
	@GetMapping("searchFreeRoom")
	public String search(ModelMap model, 
			@RequestParam(name = "checkIn", required = false) String checkIn,
			@RequestParam(name = "checkOut", required = false) String checkOut) {
		
		List<Room> list = roomService.getFreeRoom(checkIn, checkOut);	
		model.addAttribute("freeRooms", list);
		return "site/bookings/searchFreeRoom";
	}
	
	
}
