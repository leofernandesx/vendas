package com.leofernandesx.vendas.service;

import com.leofernandesx.vendas.domain.entity.Pedido;
import com.leofernandesx.vendas.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
}