package com.capg.BookStoreManagement.validations;

import com.capg.BookStoreManagement.beans.Admin;
import com.capg.BookStoreManagement.exception.InvalidAdminException;

public class ValidateAdminLogin {
	Admin as=new Admin();
	public boolean doValidateAdmin(String adminName,String adminPassword) throws InvalidAdminException {
		if(adminName.equals(as.UserNameSaved) && adminPassword.equals(as.PasswordSaved)) {
			return true;
		}
		else {
			System.out.println("-----------------------------------------");
			System.out.println("Invalid Credentials");
			System.out.println("-----------------------------------------");
			throw new InvalidAdminException();
		}
	}
}