package br.com.alura.contractmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ContratoForm (String nomeContratante,
                            Long numeroContrato,
                            String responsavel,
                            LocalDate dataVencimento,
                            BigDecimal valorContrato) {

    public Contrato toModel() {
        return new Contrato(
                this.numeroContrato,
                this.nomeContratante,
                this.responsavel,
                this.dataVencimento,
                this.valorContrato);
    }
}
