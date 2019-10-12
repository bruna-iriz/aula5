package br.com.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "conta")
public class Conta extends Auditor<Long> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long idConta;

	@Column(name = "conta_numero")
	private Long numero;

	@Column(name = "conta_agencia")
	private Long agencia;

	@Column(name = "conta_digito")
	private Long digito;

	@Column(name = "conta_limite")
	private BigDecimal limite;

	@Column(name = "conta_saldo")
	private BigDecimal saldo;

	@Column(name = "conta_ativa")
	private Boolean ativa;

    @OneToOne(mappedBy = "conta", cascade = CascadeType.ALL,
            fetch = FetchType.LAZY, optional = false)
	private Pessoa pessoa;

}
