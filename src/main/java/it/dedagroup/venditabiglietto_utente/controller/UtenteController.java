package it.dedagroup.venditabiglietto_utente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import it.dedagroup.venditabiglietto_utente.dto.request.AggiungiUtenteDto;
import it.dedagroup.venditabiglietto_utente.mapper.UtenteMapper;
import it.dedagroup.venditabiglietto_utente.servicedef.UtenteServiceDef;

@RestController
@Validated
public class UtenteController {
	
	@Autowired 
	private UtenteServiceDef utenteService;
	@Autowired
	private UtenteMapper utenteMapper;
	

	
	@PostMapping("/aggiungiCliente")
	public ResponseEntity<Void> aggiungiCliente(@RequestBody AggiungiUtenteDto request) {
		utenteService.aggiungiUtente(utenteMapper.toUtenteCliente(request));
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PostMapping("/aggiungiVenditore")
	public ResponseEntity<Void> aggiungiVenditore(@RequestBody AggiungiUtenteDto request) {
		utenteService.aggiungiUtente(utenteMapper.toUtenteVenditore(request));
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@PostMapping("/aggiungiAdmin")
	public ResponseEntity<Void> aggiungiAdmin(@RequestBody AggiungiUtenteDto request) {
		utenteService.aggiungiUtente(utenteMapper.toUtenteAdmin(request));
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
}
}
