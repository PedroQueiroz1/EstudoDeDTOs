package br.com.exemplosdtos.controller;

import br.com.exemplosdtos.dto.UsuarioLocalidadeDTO;
import br.com.exemplosdtos.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1.0/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/localidade-usuarios")
    public List<UsuarioLocalidadeDTO> buscarLocalidadeDeTodosUsuarios() {
        return usuarioService.buscarLocalidadeDeTodosUsuarios();
    }
}
