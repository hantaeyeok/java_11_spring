package com.spring3.util;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring3.controller.AjaxController;

//Springframwork validation을 활용한 VO(DTO) 검증
public class CheckValidator implements Validator{

	private static final Logger log = LoggerFactory.getLogger(AjaxController.class);
	
	@Override	
	public boolean supports(Class<?> clazz) {
		return Check.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		log.info("Springframwork validation");
		
		Check check = (Check) obj;
		ValidationUtils.rejectIfEmpty(errors, "id", "check.id.empty","아이디를 입력해주세요");
		ValidationUtils.rejectIfEmpty(errors, "pw", "check.id.empty","아이디를 입력해주세요");
		
		//ID Pattern
		Pattern pat1 = Pattern.compile("^[a-z0-9]{5,12}$", Pattern.CASE_INSENSITIVE);
		//PW Pattern
		Pattern pat2 = Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);
		
		if(!(pat1.matcher(check.getId()).matches())){
			errors.rejectValue("id", "check.id.invaild");
		}
		
		if(!(pat2.matcher(check.getPw()).matches())){
			errors.rejectValue("pw", "check.id.invaild");
		}	
	}

	
}
