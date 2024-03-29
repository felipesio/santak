/*package com.project.santak.controller;

import com.project.santak.model.Pigmento;
import com.project.santak.repository.PigmentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PigmentoController {

    @Autowired
    PigmentosRepository pig;

    @RequestMapping(value="/cadastrarPigmento", method= RequestMethod.GET)
    public String formPigmento(){
        return "formPigmento";
    }

    @RequestMapping(value="/cadastrarPigmento", method= RequestMethod.POST)
    public String formPigmento(@RequestParam String nome){
        Pigmento pigmento = new Pigmento();
        pigmento.setNome(nome);
        pig.save(pigmento);
        return "redirect:/cadastrarPigmento";
    }

    @RequestMapping(value="/pigmentos")
    public ModelAndView listaPigmento(){
        ModelAndView mv = new ModelAndView("pigmentos");
        Iterable<Pigmento> pigmento = pig.findAll();
        mv.addObject("pigmentos", pigmento);

        return mv;
    }
}
*/