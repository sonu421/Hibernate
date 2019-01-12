package com.jspiders.theatre.tester;

import com.jspiders.theatre.dao.TheatreDAO;
import com.jspiders.theatre.dto.TheatreDTO;

public class MainClass {

	public static void main(String[] args) {
		TheatreDTO theatreDTO = new TheatreDTO();
		theatreDTO.setTheatreId(1);
		theatreDTO.setName("Urvashi");
		theatreDTO.setLocation("LalBagh");
		theatreDTO.setNoOfSeats(500);
		theatreDTO.setTicketPrice(250.00);

		TheatreDAO theatreDAO = new TheatreDAO();
		theatreDAO.saveTheatre(theatreDTO);
		
	
	}

}
