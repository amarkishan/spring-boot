package com.testemployee.testemployee;
// employye
//information

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class employeecontroller {
    
    @RequestMapping("/employees")
    public List<employee> retrieveAllemployees()
    { 
        return Arrays.asList( 
            new employee(1,"Amar","science",20000), 
            new employee(2,"Raj","Engineering",30000)
        );
    }
    
}
