package com.example.tovodoo.vokabel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VokabelRepository extends JpaRepository<Vokabel, Long> {

	List<Vokabel> findBySprache(String sprache);

}
