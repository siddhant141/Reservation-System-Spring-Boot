package com.Siddhant.Gupta.learningspring;

import com.Siddhant.Gupta.learningspring.data.entity.Guest;
import com.Siddhant.Gupta.learningspring.data.entity.Reservation;
import com.Siddhant.Gupta.learningspring.data.entity.Room;
import com.Siddhant.Gupta.learningspring.data.repository.GuestRepository;
import com.Siddhant.Gupta.learningspring.data.repository.ReservationRepository;
import com.Siddhant.Gupta.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
/*
This Annotation designates this file as a Configuration file
As Well as starting of all the components scanning.
Initiates auto configuration that is part of spring boot.

 */
public class LearningSpringApplication {

	// main method for starter application
	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

//	@RestController
//	@RequestMapping("/rooms")
//	public class RoomController {
//		@Autowired
//		private RoomRepository roomRepository;
//
//		@GetMapping
//		public Iterable<Room> getRooms(){
//			return this.roomRepository.findAll();
//		}
//
//	}
//
//	@RestController
//	@RequestMapping("/guests")
//	public class GuestController {
//		@Autowired
//		private GuestRepository guestRepository;
//
//		@GetMapping
//		public Iterable<Guest> getGuests(){
//			return this.guestRepository.findAll();
//		}
//
//	}
//
//	@RestController
//	@RequestMapping("/reservations")
//	public class ReservationController {
//		@Autowired
//		private ReservationRepository reservationRepository;
//
//		@GetMapping
//		public Iterable<Reservation> getReservations(){
//			return this.reservationRepository.findAll();
//		}
//
//	}
}
