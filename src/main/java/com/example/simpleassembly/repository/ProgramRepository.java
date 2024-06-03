package com.example.simpleassembly.repository;

import com.example.simpleassembly.model.Program;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramRepository extends JpaRepository<Program, Long> {
}
