package com.example.cinema.repository;

import com.example.cinema.entity.Showtime_site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowtimeSiteRepository extends JpaRepository<Showtime_site, Long> {
    Showtime_site findShowtime_siteById(Long id);
}
