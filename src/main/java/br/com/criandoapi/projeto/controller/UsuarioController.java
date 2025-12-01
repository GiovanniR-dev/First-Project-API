package br.com.criandoapi.projeto.controller;

import br.com.criandoapi.projeto.model.Usuario;
import br.com.criandoapi.projeto.model.dao.IUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listaUsuarios(){
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criaUsuario(@RequestBody Usuario usuario){
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
    public Usuario editarUsuario(@RequestBody Usuario usuario){
        Usuario Ueditado = dao.save(usuario);
        return Ueditado;
    }

    @DeleteMapping("/{id}")
    public  Optional<Usuario> excluirUsuario(@PathVariable Integer id){
        Optional<Usuario> usuario=dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
}
