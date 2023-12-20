package com.example.cinema.repository;

import com.example.cinema.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SiteRepository extends JpaRepository<Site, Long> {
    Site findSiteById(Long id);
}
