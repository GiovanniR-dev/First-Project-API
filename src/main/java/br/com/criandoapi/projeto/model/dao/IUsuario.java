package br.com.criandoapi.projeto.model.dao;


import br.com.criandoapi.projeto.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends CrudRepository<Usuario, Integer> {
}

