package com.demo.Controller;


import com.demo.model.Note;
import com.demo.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {



    @GetMapping(path = "/fun")
    public @ResponseBody
    String hello() {
        return "Hello my controller";
    }

}
