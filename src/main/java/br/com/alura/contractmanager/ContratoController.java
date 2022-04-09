package br.com.alura.contractmanager;

import br.com.alura.contractmanager.entities.*;
import br.com.alura.contractmanager.repositories.ContratoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
public class ContratoController {

    private final ContratoRepository contratoRepository;

    public ContratoController(ContratoRepository contratoRepository) {
        this.contratoRepository = contratoRepository;
    }

    @GetMapping("/contratos")
    public String listarContrato(Model model) {
        List<Contrato> contratos = contratoRepository.findAll();
        model.addAttribute("contratos", contratos.stream().map(ContratoView::new).toList());
        return "contratos/list";
    }

    @GetMapping("/contratos/novo")
    public String createAnimalForm(ContratoForm contratoForm, Model model) {
        model.addAttribute("status", Status.values());

        return "contratos/form";
    }

    @PostMapping("/contratos")
    public String createPlace(@Valid ContratoForm contratoForm) {
        Contrato newContrato = contratoForm.toModel();

        if (newContrato.getDataVencimento().isBefore(LocalDate.now())) {
            newContrato.setStatus(Status.VENCIDO);
        } else {
            newContrato.setStatus(Status.ATIVO);
        }

        contratoRepository.save(newContrato);
        return "redirect:/contratos/";
    }
}
