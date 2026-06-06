package com.solucao_computacional.service;

import com.solucao_computacional.model.Usuario;
import com.solucao_computacional.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario cadastrar(Usuario usuario) {
        if (usuarioRepository.existePorLogin(usuario.getLogin())) {
            throw new RuntimeException("Já existe um usuário com esse login.");
        }

        if (usuarioRepository.existePorCpf(usuario.getCpf())) {
            throw new RuntimeException("Já existe um usuário com esse CPF.");
        }

        return usuarioRepository.salvar(usuario);
    }

    public List<Usuario> listarTodos() {
        return usuarioRepository.listarTodos();
    }

    public Usuario buscarPorLogin(String login) {
        return usuarioRepository.buscarPorLogin(login)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado."));
    }
}