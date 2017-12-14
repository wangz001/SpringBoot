package com.example.springroot.repository;

import com.example.springroot.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlReposity extends JpaRepository<Girl, Integer> {
}
