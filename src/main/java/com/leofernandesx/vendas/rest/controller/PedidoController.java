package com.leofernandesx.vendas.rest.controller;

import com.leofernandesx.vendas.domain.entity.Pedido;
import com.leofernandesx.vendas.domain.entity.Produto;
import com.leofernandesx.vendas.domain.repository.Produtos;
import com.leofernandesx.vendas.rest.dto.PedidoDTO;
import com.leofernandesx.vendas.service.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save( @RequestBody PedidoDTO dto ){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }

}