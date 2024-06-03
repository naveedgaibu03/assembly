package com.example.simpleassembly.controller;

import com.example.simpleassembly.model.Program;
import com.example.simpleassembly.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/programs")
public class ProgramController {

    @Autowired
    private ProgramService programService;

    @PostMapping
    public Program saveProgram(@RequestBody String programText) {
        return programService.saveProgram(programText);
    }
}
