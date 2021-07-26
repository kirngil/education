package com.kiran.education;

import com.kiran.education.model.Inquiry;
import com.kiran.education.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
   private HomeService homeService;
    @GetMapping("/")
   // @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        Inquiry inquiry = new Inquiry();
        model.addAttribute(inquiry);
        return "index";
    }
    @GetMapping("/course")
    public String course(Model model){
        model.addAttribute("courses",   homeService.getCourses());

        return "course.html";
    }
    @GetMapping("/about")
    public String about(){
        return "about.html";
    }

    @PostMapping("/course")
    public String searchCourse(Model model, @ModelAttribute Inquiry inquiry){

        String courseName = inquiry.getSearchString();
        model.addAttribute("courses", homeService.searchCourses(courseName));
       return "course";
    }


}
