package com.controlefinanceiro.controle_financeiro.transacao;

import com.controlefinanceiro.controle_financeiro.usuario.UsuarioEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transacao")

public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "descricao")
    private String descricao;
    @Enumerated(EnumType.STRING)
    private TipoTransacao transacao;
    @Column (name = "data")
    private LocalDate date;
    @Column (name = "valor")
    private BigDecimal valor;
    @Column (name = "categoria")
    private String categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

}

    enum TipoTransacao{
        ENTRADA,
        SAIDA
    }
