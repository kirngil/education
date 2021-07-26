package com.kiran.education.service;

import com.kiran.education.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    public List<Course> getCourses(){
       List<Course> courses= new ArrayList<Course>();
       Course c1 = new Course(1,"Backend","https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodecondo.com%2Fawesome-facts-that-will-make-you-be-a-back-end-developer%2F&psig=AOvVaw3RvFhA6y-KYqA80Ob8_gC5&ust=1627343672737000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIiwqt-1__ECFQAAAAAdAAAAABAD",
               "Kiran",9);
       Course c2= new Course(2,"Frontend", "https://www.google.com/url?sa=i&url=https%3A%2F%2Finitialcommit.com%2Fblog%2Ffrontend-development-skills&psig=AOvVaw0YLbUur-p11nBtEMzqFDQX&ust=1627343746517000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCMjamIO2__ECFQAAAAAdAAAAABAD",
               "Test",10);
       courses.add(c1);
       courses.add(c2);
       return courses;
    }

    public List<Course> searchCourses( String courseName){
        List<Course> courses= new ArrayList<Course>();
        Course c1 = new Course(1,courseName,"https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodecondo.com%2Fawesome-facts-that-will-make-you-be-a-back-end-developer%2F&psig=AOvVaw3RvFhA6y-KYqA80Ob8_gC5&ust=1627343672737000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCIiwqt-1__ECFQAAAAAdAAAAABAD",
                "InstructorName",9);
        courses.add(c1);
        return courses;
    }

}
