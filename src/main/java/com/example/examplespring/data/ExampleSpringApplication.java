package com.example.examplespring.data;

import com.example.examplespring.data.repository.*;
import com.example.examplespring.data.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ExampleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleSpringApplication.class, args);
	}
	
	@RestController // http ile request yapmak isterken controller kullanırız
	@RequestMapping("/rooms") // http istek tipi belirtiriz.
	public class RoomController {
		@Autowired// Bean içerisindeki değerleri başka bean içerisine enjekte etmek için kullanılır.
		private RoomRepository roomRepository;
		
		@GetMapping 
		public Iterable<Room> getRooms(){
			return this.roomRepository.findAll();
		}


	}

	@RestController
	@RequestMapping("/guests")
	public class GuestController {
		@Autowired
		private GuestRepository guestRepository;

		@GetMapping
		public Iterable<Guest> getGuests(){
			return this.guestRepository.findAll();
		}
	}

	@RestController
	@RequestMapping("/reservation")
	public class ReservationController{
		@Autowired
		private ReservationRepository reservationRepository;

		@GetMapping
		public Iterable<Reservation> getReservation(){
			return this.reservationRepository.findAll();
		}
	}

}
