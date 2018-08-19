package com.livecricket.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.livecricket.daoimpl.LiveCricketDao;
import com.livecricket.exception.DaoException;
import com.livecricket.model.CricketResponse;
import com.livecricket.model.Player;

@Path("/cricketUpdates")
public class LiveCricketService {
	
	@POST
	@Path("/regPlayer")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response registerPlayer(Player player){
		CricketResponse response = new CricketResponse();
		if(player.getPalyerId() == null || player.getPalyerId().isEmpty()){
			System.out.println("PlayerId Should not be null or empty");
			response.setErrorCode("001");
			response.setErrorMessage("PlayerId Should not be null or empty");
			return Response.status(200).entity(response).build();
		}
		if(player.getMobile() == null || player.getMobile().isEmpty()){
			System.out.println("Player Mobile Should not be null or empty");
			response.setErrorCode("002");
			response.setErrorMessage("Player Mobile Should not be null or empty");
			return Response.status(200).entity(response).build();
		}
		
		try{
			LiveCricketDao lcDao = new LiveCricketDao();
			lcDao.registerPlayer(player);
		}catch(DaoException daoExe){
			response.setErrorCode(daoExe.getReasonCode());
			response.setErrorMessage(daoExe.getMessage());
			response.setresponseData(null);
			return Response.status(200).entity(response).build();
		}
		
		response.setErrorCode("000");
		response.setErrorMessage("SUCCESS");
		Gson gson = new Gson();
		String jsonPlayer = gson.toJson(player);
		response.setresponseData(jsonPlayer);
		System.out.println("Player - : "  + player.getPalyerId() +  " - " +player.getPlayerName() + "Registration Successfully done");
		return Response.status(200).entity(response).build();
	}
	
}
