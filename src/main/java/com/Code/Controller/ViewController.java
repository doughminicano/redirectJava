package com.Code.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {
	
    @RequestMapping("/")
    public String index(Model model, HttpSession session) {
    	model.addAttribute("code", (String) session.getAttribute("theCode"));
		return "index.jsp";

    }
    
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public String submission(
    		@RequestParam(value="theCode") String theCode) {
    	
    	String code = "bushido";
    	
    	if(theCode.matches(code)) {
    		
    		return "redirect:/code";
    		
    	} else {
    		
    		return "redirect:/createError";
    	}
    }
    
    @RequestMapping("/code")
    public String code() {
		return "Code.jsp";

    }
    
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "***You must train harder!***" );
        return "redirect:/";
    }

//    @RequestMapping(value="/", method=RequestMethod.POST)
//    public String index(@RequestParam(value="code") String code) {
//		return "index.jsp";
//
//    }
    
//    public class UsersController {
//        @RequestMapping(value="/login", method=RequestMethod.POST)
//        public String login(@RequestParam(value="user") String user, @RequestParam(value="password") String password) {
//              // ... process information and save it to the session
//              return "redirect:/dashboard";
//        }
        
    }