package com.bala.web.model.dao;

import com.bala.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("bala");
		a.setTech("java");
		
		return a;
		
	}

}
