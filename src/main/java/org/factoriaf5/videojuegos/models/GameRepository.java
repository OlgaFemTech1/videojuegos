package org.factoriaf5.videojuegos.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;

@Repository
public interface GameRepository extends CrudRepository<Game, Long> { }
