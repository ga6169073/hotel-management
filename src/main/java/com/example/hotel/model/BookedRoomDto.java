package com.example.hotel.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.example.hotel.domain.BookedRoom;
import com.example.hotel.domain.Room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoomDto implements Serializable{
	private Long bookedRoomId;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date checkIn;
	
	@NotNull
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date checkOut;
	
	@NotNull
	private double price;
	
	@NotNull
	private double amount;
	
	private Boolean isCheckIn;
	
	@NotNull
	private Long roomId;
}
