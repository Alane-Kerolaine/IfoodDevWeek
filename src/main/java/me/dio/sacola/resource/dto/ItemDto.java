package me.dio.sacola.resource.dto;

import lombok.*;

import javax.persistence.Embeddable;

@AllArgsConstructor
@Builder
@Embeddable
@Getter
@NoArgsConstructor
@Setter
public class ItemDto {
    private Long produtoId;
    private int quantidade;
    private Long sacolaId;
}
