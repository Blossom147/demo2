package com.example.demo2;

import com.example.DTO.NewDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class NewAPI {
//    @RequestMapping(value = "/new",method = RequestMethod.POST)
    @PostMapping(value = "/new")
//    @ResponseBody

    public NewDTO createNew(@RequestBody NewDTO model){
        return model;
    }
}
