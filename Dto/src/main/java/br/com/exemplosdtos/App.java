package br.com.exemplosdtos;

import br.com.exemplosdtos.model.Localidade;
import br.com.exemplosdtos.model.Usuario;
import br.com.exemplosdtos.repository.LocalidadeRepository;
import br.com.exemplosdtos.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private LocalidadeRepository localidadeRepository;

    @Override
    public void run(String... args) throws Exception {

        Localidade localidade = new Localidade();
        localidade.setLugar("Lugar");
        localidade.setDescricao("Descricao");
        localidade.setLongitude(1.0);
        localidade.setLatitude(0.0);
        localidadeRepository.save(localidade);

        Usuario usuario1 = new Usuario();
        usuario1.setEmail("usuario1@email.com");
        usuario1.setPrimeiroNome("Usuario1");
        usuario1.setUltimoNome("NumberOne");
        usuario1.setSenha("SenhaUm");
        usuario1.setLocalidade(localidade);
        usuarioRepository.save(usuario1);

        Usuario usuario2 = new Usuario();
        usuario2.setEmail("usuario2@email.com");
        usuario2.setPrimeiroNome("Usuario2");
        usuario2.setUltimoNome("NumberTwo");
        usuario2.setSenha("SenhaDois");
        usuario2.setLocalidade(localidade);
        usuarioRepository.save(usuario2);
    }
}
