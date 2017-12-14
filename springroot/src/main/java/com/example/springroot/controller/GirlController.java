package com.example.springroot.controller;


import com.example.springroot.repository.GirlReposity;
import com.example.springroot.domain.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/girl")
public class GirlController {

    @Autowired
    private GirlReposity girlReposity;

    @GetMapping(value = "/girls")
    public List<Girl> girls() {
        return girlReposity.findAll();
    }

    @GetMapping(value = "/girl/{id}")
    public Girl Get(@PathVariable("id") Integer id) {
        return girlReposity.findOne(id);
    }
}
