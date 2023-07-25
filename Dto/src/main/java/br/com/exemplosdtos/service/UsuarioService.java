package br.com.exemplosdtos.service;

import br.com.exemplosdtos.dto.UsuarioLocalidadeDTO;
import br.com.exemplosdtos.model.Usuario;
import br.com.exemplosdtos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioLocalidadeDTO> buscarLocalidadeDeTodosUsuarios() {
        return usuarioRepository.findAll()
                .stream()
                .map(this::converterEntidadeParaDTO)
                .collect(Collectors.toList());
    }

    private UsuarioLocalidadeDTO converterEntidadeParaDTO(Usuario usuario) {
        UsuarioLocalidadeDTO usuarioLocalidadeDTO = new UsuarioLocalidadeDTO();
        usuarioLocalidadeDTO.setPrimeiroNome(usuario.getPrimeiroNome());
        usuarioLocalidadeDTO.setEmail(usuario.getEmail());
        usuarioLocalidadeDTO.setLugar(usuario.getLocalidade().getLugar());
        usuarioLocalidadeDTO.setDescricao(usuario.getLocalidade().getDescricao());
        usuarioLocalidadeDTO.setLongitude(usuario.getLocalidade().getLongitude());
        usuarioLocalidadeDTO.setLatitude(usuario.getLocalidade().getLatitude());

        return usuarioLocalidadeDTO;
    }
}
