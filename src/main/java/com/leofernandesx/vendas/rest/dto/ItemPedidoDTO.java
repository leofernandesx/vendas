package com.leofernandesx.vendas.rest.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemPedidoDTO {
    private Integer produto;
    private Integer quantidade;
}

