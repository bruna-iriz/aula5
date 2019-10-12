package br.com.entity;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "pessoa")
public class Pessoa extends Auditor<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @Column(name = "nome_pessoa")
    private String nome;


    @Column(name = "data_nascimento", insertable = false, updatable = false)
    private Date dataNascimento;

    @Column(name = "documento")
    private String documento;

    @NotNull
    @Column(name = "tipo_pessoa")
    private String tipoPessoa;

    @OneToOne
    @JoinColumn(name = "idConta")
    private Conta conta;

}
