package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Partida;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Partida entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PartidaRepository extends JpaRepository<Partida, Long>, JpaSpecificationExecutor<Partida> {}