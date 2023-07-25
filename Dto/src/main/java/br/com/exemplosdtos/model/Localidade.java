package br.com.exemplosdtos.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "localidades")
public class Localidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lugar;

    private String descricao;

    private double longitude;

    private double latitude;
}
