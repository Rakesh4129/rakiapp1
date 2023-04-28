package com.crud.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Entity.Workers;


public interface WorkersRepository extends JpaRepository<Workers, Long> {

}
