package com.solucao_computacional.repository;

import com.solucao_computacional.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository {

    private final List<Usuario> usuarios = new ArrayList<>();

    public Usuario salvar(Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listarTodos() {
        return usuarios;
    }

    public Optional<Usuario> buscarPorLogin(String login) {
        return usuarios.stream()
                .filter(usuario -> usuario.getLogin() != null)
                .filter(usuario -> usuario.getLogin().equalsIgnoreCase(login))
                .findFirst();
    }

    public boolean existePorLogin(String login) {
        if (login == null) {
            return false;
        }

        return usuarios.stream()
                .filter(usuario -> usuario.getLogin() != null)
                .anyMatch(usuario -> usuario.getLogin().equalsIgnoreCase(login));
    }

    public boolean existePorCpf(String cpf) {
        if (cpf == null) {
            return false;
        }

        return usuarios.stream()
                .filter(usuario -> usuario.getCpf() != null)
                .anyMatch(usuario -> usuario.getCpf().equalsIgnoreCase(cpf));
    }
}