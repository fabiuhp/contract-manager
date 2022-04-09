package br.com.alura.contractmanager.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ContratoForm (String email,
                            String nomeContratante,
                            Long numeroContrato,
                            String responsavel,
                            String telefoneResponsavel,
                            LocalDate dataVencimento,
                            BigDecimal valorContrato) {

    public Contrato toModel() {
        return new Contrato(
                this.email,
                this.numeroContrato,
                this.nomeContratante,
                this.responsavel,
                this.telefoneResponsavel,
                this.dataVencimento,
                this.valorContrato);
    }
}
