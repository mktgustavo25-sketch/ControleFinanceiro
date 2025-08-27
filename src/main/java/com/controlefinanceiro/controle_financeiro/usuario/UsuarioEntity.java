package com.controlefinanceiro.controle_financeiro.usuario;

import com.controlefinanceiro.controle_financeiro.transacao.TransacaoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "usuario")

public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "senha")
    private String senha;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TransacaoEntity> transacoes;
}
