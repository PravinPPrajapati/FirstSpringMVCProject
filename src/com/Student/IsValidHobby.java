package com.Student;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.FIELD }) 
public @interface IsValidHobby {

	String message() default "Student hobby must 1 of below : Music, Football, Cricket, Hockey";
	 
	Class<?>[] groups() default {};
 
	Class<? extends Payload>[] payload() default {};
 
	boolean value() default true;
	
}
	