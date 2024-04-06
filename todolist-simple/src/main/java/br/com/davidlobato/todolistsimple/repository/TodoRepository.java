package br.com.davidlobato.todolistsimple.repository;

import br.com.davidlobato.todolistsimple.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> { }
