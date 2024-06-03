package com.example.simpleassembly.service;

import com.example.simpleassembly.model.Program;
import com.example.simpleassembly.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ProgramService {

    @Autowired
    private ProgramRepository programRepository;

    private static final Logger logger = LoggerFactory.getLogger(ProgramService.class);

    public Program saveProgram(String programText) {
        logger.info("Saving program");
        Program program = new Program();
        program.setProgramText(programText);
        String result = executeProgram(programText);
        program.setResult(result);
        return programRepository.save(program);
    }

    private String executeProgram(String programText) {
        int reg1 = 0, reg2 = 0;
        String[] lines = programText.split("\n");
        for (String line : lines) {
            String[] parts = line.split(" ");
            switch (parts[0]) {
                case "MV":
                    if (parts[1].equals("REG1")) {
                        reg1 = Integer.parseInt(parts[2].substring(1));
                    } else if (parts[1].equals("REG2")) {
                        reg2 = Integer.parseInt(parts[2].substring(1));
                    }
                    break;
                case "ADD":
                    if (parts[1].equals("REG1")) {
                        if (parts[2].startsWith("REG")) {
                            reg1 += reg2;
                        } else {
                            reg1 += Integer.parseInt(parts[2]);
                        }
                    }
                    break;
                case "SHOW":
                    if (parts[1].equals("REG1")) {
                        return String.valueOf(reg1);
                    } else if (parts[1].equals("REG2")) {
                        return String.valueOf(reg2);
                    }
                    break;
            }
        }
        return "";
    }
}
