package com.unimaps.api.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

	@RequestMapping(value = "/remover/{pavilhaoId}", method = RequestMethod.GET )
	public String removerPavilhao(@PathVariable(required = true) String pavilhaoId) {
		Optional<Pavilhao> pavilhao = this.pavilhaoRepository.findById(pavilhaoId);
		pavilhao.ifPresent(p -> this.pavilhaoRepository.delete(p));
		return "redirect:/home";
	}
	
	@RequestMapping(value = "/editar/{pavilhaoId}", method = RequestMethod.POST)
	public String editar(@PathVariable(required = true) String pavilhaoId, PavilhaoDTO newPav) {
		Optional<Pavilhao> pavilhao = this.pavilhaoRepository.findById(pavilhaoId);
		if(pavilhao.isPresent()) {
			Pavilhao p = pavilhao.get();
			p.setNome(newPav.getNome());
			this.pavilhaoRepository.save(p);
		}
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
