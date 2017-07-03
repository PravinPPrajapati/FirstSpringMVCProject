package com.Student;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@Override
	public void initialize(IsValidHobby arg0) {
		
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		if(studentHobby == null)
			return false;
		
		if(studentHobby.matches("Music|Football|Cricket|Hockey"))
			return true;
		else
			return false;
	}

	
	
	
}
