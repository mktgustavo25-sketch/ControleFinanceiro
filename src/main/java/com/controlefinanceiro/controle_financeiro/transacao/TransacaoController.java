package com.controlefinanceiro.controle_financeiro.transacao;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transacoes")
@RequiredArgsConstructor
public class TransacaoController {

    private final TransacaoRepository transacaoRepository;

    @PostMapping
    public TransacaoEntity criar(@RequestBody TransacaoEntity transacao) {
        return transacaoRepository.save(transacao);
    }

    @GetMapping
    public List<TransacaoEntity> listar() {
        return transacaoRepository.findAll();
    }
}
