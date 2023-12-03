package com.proleesh.springcrudwithreact.repository;

import com.proleesh.springcrudwithreact.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
