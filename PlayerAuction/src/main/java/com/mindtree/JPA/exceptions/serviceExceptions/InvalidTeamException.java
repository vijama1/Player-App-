package com.mindtree.JPA.exceptions.serviceExceptions;

import com.mindtree.JPA.exceptions.ServiceException;

public class InvalidTeamException extends ServiceException{

	public InvalidTeamException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidTeamException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}

	public InvalidTeamException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	public InvalidTeamException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	public InvalidTeamException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	

}
