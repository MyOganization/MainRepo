package com.example.tutorial.pages;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.annotations.*;
import org.apache.tapestry5.corelib.components.*;
import org.apache.tapestry5.SymbolConstants;
import org.apache.tapestry5.alerts.AlertManager;
import org.hibernate.Session;
import org.openqa.selenium.internal.seleniumemulation.CreateCookie;

import com.example.tutorial.entities.Address;

/**
 * Start page of application tutorial1.
 */
public class Index
{
	private final Random random = new Random(System.nanoTime());

	@Inject
	private Session session;
	
	
	public List<Address> getAddresses()
	{
		return session.createCriteria(Address.class).list();
	}
	
//	@InjectPage
//	private Guess guess;
	

	
//  @Log
//	Object onActionFromStart()  
//	{   
//		int target = random.nextInt(10) + 1;
//		guess.setup(target);
//		
//		return guess;
//	}
}