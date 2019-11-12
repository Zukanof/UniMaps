package com.unimaps.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.unimaps.api.entities.Pavilhao;
import com.unimaps.api.enums.BlocoEnum;
import com.unimaps.api.repository.PavilhaoRepository;

@Controller
public class NavegacaoController {

	@Autowired
	private PavilhaoRepository pavilhaoRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		Optional<List<Pavilhao>> bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.A));
		bloco.ifPresent(b -> mv.addObject("bloco_a", b));				
		bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.B));
		bloco.ifPresent(b -> mv.addObject("bloco_b", b));
		bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.C));
		bloco.ifPresent(b -> mv.addObject("bloco_c", b));
		bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.D));
		bloco.ifPresent(b -> mv.addObject("bloco_d", b));
		bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.E));
		bloco.ifPresent(b -> mv.addObject("bloco_e", b));
		bloco = Optional.ofNullable(pavilhaoRepository.findByBloco(BlocoEnum.F));
		bloco.ifPresent(b -> mv.addObject("bloco_f", b));
		return mv;
	}
}
