package com.unimaps.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unimaps.api.dto.PavilhaoDTO;
import com.unimaps.api.entities.Pavilhao;
import com.unimaps.api.repository.PavilhaoRepository;

@Controller
@RequestMapping(value = "/pavilhao")
public class PavilhaoController {

	@Autowired
	private PavilhaoRepository pavilhaoRepository;

	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String form (PavilhaoDTO pavilhao) {
		this.pavilhaoRepository.save(this.convertPavilhaoDTOEntity(pavilhao));
		return "redirect:/home";
	}

	@RequestMapping(value = "/remover/{pavilhao}", method = RequestMethod.GET)
	public String removerPavilhao(String id) {
		Optional<Pavilhao> pavilhao = this.pavilhaoRepository.findById(id);
		pavilhao.ifPresent(p -> this.pavilhaoRepository.delete(p));
		return "redirect:/home";
	}

	private Pavilhao convertPavilhaoDTOEntity (PavilhaoDTO dto) {
		Pavilhao pavilhao = new Pavilhao();
		if (dto.getId().isPresent()) {
			pavilhao.setId(dto.getId().get());
		}
		pavilhao.setNome(dto.getNome());
		pavilhao.setBloco(dto.getBloco());
		return pavilhao;
	}
}
