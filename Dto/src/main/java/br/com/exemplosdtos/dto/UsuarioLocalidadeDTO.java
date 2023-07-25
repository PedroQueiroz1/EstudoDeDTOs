package br.com.exemplosdtos.dto;

import lombok.Data;

@Data
public class UsuarioLocalidadeDTO {

    private String primeiroNome;
    private String email;
    private String lugar;
    private String descricao;
    private double longitude;
    private double latitude;

}
