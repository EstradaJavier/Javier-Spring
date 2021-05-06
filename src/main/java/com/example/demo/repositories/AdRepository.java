package com.example.demo.repositories;

import com.example.demo.models.Ad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AdRepository extends JpaRepository<Ad, Long> {

}