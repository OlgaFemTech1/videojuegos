package org.factoriaf5.videojuegos.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface GameRepository extends CrudRepository<Game, Long> { }
