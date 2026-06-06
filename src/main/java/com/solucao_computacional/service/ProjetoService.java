package com.solucao_computacional.service;

import com.solucao_computacional.dto.ProjetoRequest;
import com.solucao_computacional.model.PerfilUsuario;
import com.solucao_computacional.model.Projeto;
import com.solucao_computacional.model.Usuario;
import com.solucao_computacional.repository.ProjetoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {

    private final ProjetoRepository projetoRepository;
    private final UsuarioService usuarioService;

    public ProjetoService(ProjetoRepository projetoRepository, UsuarioService usuarioService) {
        this.projetoRepository = projetoRepository;
        this.usuarioService = usuarioService;
    }

    public Projeto cadastrar(ProjetoRequest request) {
        Usuario gerente = usuarioService.buscarPorLogin(request.getLoginGerente());

        if (gerente.getPerfil() != PerfilUsuario.GERENTE) {
            throw new RuntimeException("O responsável pelo projeto precisa ter perfil GERENTE.");
        }

        Projeto projeto = new Projeto(
                request.getNome(),
                request.getDescricao(),
                request.getDataInicio(),
                request.getDataTerminoPrevista(),
                request.getStatus(),
                gerente
        );

        return projetoRepository.salvar(projeto);
    }

    public List<Projeto> listarTodos() {
        return projetoRepository.listarTodos();
    }

    public Projeto buscarPorNome(String nome) {
        return projetoRepository.buscarPorNome(nome)
                .orElseThrow(() -> new RuntimeException("Projeto não encontrado."));
    }
}