package com.project.santak.repository;

import com.project.santak.model.Material;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MateriaisRepository extends CrudRepository<Material, Integer> {
}
