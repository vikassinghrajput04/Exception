package com.exception;

public class TestLogin {
	
	
	public static void main(String[] args) throws LoginIdException {

		String login="vikass@gmail.com";
		String password = "123";
		
		
		LoginClass l=new LoginClass();
		l.setLoginID("vikass@gmail.com");
		l.setPassword("123");
			
		if (login.equals(l.getLoginID())&&password.equals(l.getPassword())){
			System.out.println("login successfull");
		} else {
				throw new LoginIdException("Invalid LoginId / Password");
		}
	}
}
