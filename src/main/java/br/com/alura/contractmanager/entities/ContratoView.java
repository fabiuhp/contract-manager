package br.com.alura.contractmanager.entities;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class ContratoView {
    private Long id;
    private Long numeroContrato;
    private String nomeContratante;
    private String responsavel;
    private LocalDate dataVencimento;
    private Status status;
    private BigDecimal valorContrato;

    public ContratoView(Contrato contrato) {
        this.id = contrato.getId();
        this.numeroContrato = contrato.getNumeroContrato();
        this.nomeContratante = contrato.getNomeContratante();
        this.responsavel = contrato.getResponsavel();
        this.dataVencimento = contrato.getDataVencimento();
        this.status = contrato.getStatus();
        this.valorContrato = contrato.getValorContrato();
    }
}
