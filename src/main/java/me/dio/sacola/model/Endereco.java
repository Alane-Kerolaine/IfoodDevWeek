package me.dio.sacola.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@AllArgsConstructor
@Builder
@Embeddable
@Getter
@NoArgsConstructor
@Setter
public class Endereco {
    private String cep;
    private String complemento;
}
