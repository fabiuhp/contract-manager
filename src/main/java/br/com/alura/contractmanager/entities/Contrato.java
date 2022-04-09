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

    private String email;
    private Long numeroContrato;
    private String nomeContratante;
    private String responsavel;
    private String telefoneResponsavel;
    private LocalDate dataVencimento;
    private Status status;
    private BigDecimal valorContrato;

    public Contrato(String email, Long numeroContrato, String nomeContratante, String responsavel, String telefoneResponsavel, LocalDate dataVencimento, BigDecimal valorContrato) {
        this.email = email;
        this.numeroContrato = numeroContrato;
        this.nomeContratante = nomeContratante;
        this.responsavel = responsavel;
        this.telefoneResponsavel = telefoneResponsavel;
        this.dataVencimento = dataVencimento;
        this.valorContrato = valorContrato;
    }

    @Deprecated
    public Contrato() {
    }
}
