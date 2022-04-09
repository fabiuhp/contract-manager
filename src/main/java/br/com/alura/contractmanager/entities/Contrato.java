package br.com.alura.contractmanager.entities;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Contrato {

    @Id
    @GeneratedValue
    private Long id;

    private Long numeroContrato;
    private String nomeContratante;
    private String responsavel;
    private LocalDate dataVencimento;
    private Status status;
    private BigDecimal valorContrato;

    public Contrato(Long numeroContrato, String nomeContratante, String responsavel, LocalDate dataVencimento, BigDecimal valorContrato) {
        this.numeroContrato = numeroContrato;
        this.nomeContratante = nomeContratante;
        this.responsavel = responsavel;
        this.dataVencimento = dataVencimento;
        this.valorContrato = valorContrato;
    }

    @Deprecated
    public Contrato() {
    }
}
