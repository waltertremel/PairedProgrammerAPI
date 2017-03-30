package com.programmers.practice.controllers;

/**
 * Created by xpdesktop on 3/28/17.
 */

import com.programmers.practice.domain.Programmer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

@RestController
public class Programmers {

    @PostMapping(path = "/programmers", produces = APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Programmer addProgrammer(@RequestBody Programmer programmer) {
        return programmer.copy().withId(1).build();
    }

    @GetMapping(path = "/programmers/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Programmer getProgrammer(@PathVariable Integer id) {
        return Programmer.builder().withId(id).withName("programmerName").build();
    }
}
