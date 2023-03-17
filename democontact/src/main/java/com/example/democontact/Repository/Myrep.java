package com.example.democontact.Repository;

import com.example.democontact.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Myrep extends JpaRepository<Contact,Long> {
}
