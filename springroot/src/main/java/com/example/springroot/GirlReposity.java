package com.example.springroot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlReposity extends JpaRepository<Girl, Integer> {
}
