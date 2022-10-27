package com.practica01.controller;

import com.practica01.domain.Estado;
import com.practica01.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstadoController {

    //Provoca que el objeto se cree si no existe o se use el que ya existe... no hace mas de 1 objeto
    //Esto se conoce como inyeccion de dependencias...
    @Autowired
    private EstadoService estadoService;

    @GetMapping("/estado/nuevo")
    public String estadoNuevo(Estado estado) {
        return "modificarEstado";
    }

    @PostMapping("/estado/guardar")
     public String estadoGuardar(Estado estado) {
        estadoService.save(estado);
        return "redirect:/";
    }

    @GetMapping("/estado/actualiza/{idEstado}")
    public String estadoActualiza(Estado estado, Model model) {
        estado = estadoService.getEstado(estado);
        model.addAttribute("estado", estado);
        return "modificarEstado";

    }

    @GetMapping("/estado/elimina/{idEstado}")
    public String estadoElimina(Estado estado) {
        estadoService.delete(estado);
        return "redirect:/";

    }
}
