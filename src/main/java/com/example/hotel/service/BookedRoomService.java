package com.example.hotel.service;

import com.example.hotel.domain.BookedRoom;

public interface BookedRoomService {

	BookedRoom getById(Long id);

	void deleteAll();

	void deleteById(Long id);

	<S extends BookedRoom> S save(S entity);

}
