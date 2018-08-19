package com.livecricket.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.exception.ConstraintViolationException;

import com.livecricket.dao.ICricketLive;
import com.livecricket.dbutil.DBUtil;
import com.livecricket.exception.DaoException;
import com.livecricket.model.Player;

public class LiveCricketDao implements ICricketLive{

	public void registerPlayer(Player player) {
		try{
			SessionFactory sessionFactory = DBUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			session.save(player);
			session.beginTransaction().commit();
			
		}catch(ConstraintViolationException cve){
			SessionFactory sessionFactory = DBUtil.getSessionFactory();
			Session session = sessionFactory.openSession();
			Player playerRes = (Player)session.get(Player.class, player.getEmail());
			if(playerRes != null){
				throw new DaoException("1001", "Dupliacte Recored Entry", "You Are Trying To Insert Duplicate Record For Email Id");				
			}
			throw new DaoException("1001", "Dupliacte Recored Entry", "You Are Trying To Insert Duplicate Record For Mobile Number");
			//System.out.println(ae.getMessage());
		}catch(Exception e){
			throw new DaoException("1002", "Database Problem", "Getting Database Problem");
		}
		
	}

}
