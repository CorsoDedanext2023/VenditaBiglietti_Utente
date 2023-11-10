package it.dedagroup.venditabiglietto_utente.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.dedagroup.venditabiglietto_utente.model.Ruolo;
import it.dedagroup.venditabiglietto_utente.model.Utente;
import it.dedagroup.venditabiglietto_utente.repository.UtenteRepository;
import it.dedagroup.venditabiglietto_utente.servicedef.UtenteServiceDef;
import jakarta.transaction.Transactional;

@Service
public class UtenteServiceImpl implements UtenteServiceDef {
	
	@Autowired
	private UtenteRepository utenteRepository;

	@Override
	public Utente findByEmailAndPassword(String email, String password) {
		return utenteRepository.findByEmailAndPassword(email, password).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}

	@Override
	public Utente findByTelefono(String telefono) {
		return utenteRepository.findByTelefono(telefono).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}

	@Override
	public Utente findByData_Di_Nascita(String data_di_nascita) {
		return utenteRepository.findByData_Di_Nascita(data_di_nascita).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}

	@Override
	public Utente findByNomeAndCognome(String nome, String cognome) {
		return utenteRepository.findByNomeAndCognome(nome, cognome).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}

	@Override
	public Utente findByRuolo(Ruolo ruolo) {
		return utenteRepository.findByRuolo(ruolo).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST));
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public void aggiungiUtente(Utente utente) {
		utenteRepository.save(utente);
		
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Utente modificaUtente(Utente utente) {
		return utenteRepository.save(utente);
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public Utente eliminaUtente(Utente utente) {
		utente.setAvailable(false);
		return utenteRepository.save(utente);
	}

}
