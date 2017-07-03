package com.Student;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.tags.BindErrorsTag;

@Controller
public class StudentAdmissionController
{ 
	@InitBinder
	public void initSetup(WebDataBinder binder)
	{
		//binder.setDisallowedFields(new String[]{"studentMobile"});
		//binder.setDisallowedFields("studentMobile");
		
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
		binder.registerCustomEditor(String.class, "studentName", new StudentNameEditor());
	}
	
	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	protected ModelAndView studentAdmissionForm() {
		ModelAndView modelView = new ModelAndView("AdmissionForm");
		return modelView;
	}
	
	@ModelAttribute
	public void addCommonMessage(Model model)
	{
		model.addAttribute("MainMessage", "Message to display as Main page");
	}
	
	@RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
	protected ModelAndView studentAdmissionSubmission(@Valid @ModelAttribute("studentObj") Student studentObj, BindingResult result) {
//		protected ModelAndView studentAdmissionSubmission(@RequestParam Map<String,String> paramArg) {
//		protected ModelAndView studentAdmissionSubmission(@RequestParam("name") String name, @RequestParam("hobby") String hobby) {
		ModelAndView modelView = new ModelAndView("AdmissionSuccess");
		if(result.hasErrors())
		{
			modelView = new ModelAndView("AdmissionForm");
		}
		
		
		
		return modelView;
		/*
		String name = paramArg.get("studentName");
		String hobby = paramArg.get("studentHobby");
		
		Student studentObj = new Student();
		studentObj.setStudentName(name);
		studentObj.setStudentHobby(hobby);
		modelView.addObject("studentObj", studentObj);
	*/
	}

	/*@RequestMapping("/welcome2")
	protected ModelAndView handleRequestInternal2(
			HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse) throws Exception {
		
		ModelAndView modelView = new ModelAndView("HelloPage");
		modelView.addObject("welcomeMessage", "Hi, Welcome to first spring MVC 2");
		
		return modelView;  
	}  */

}
