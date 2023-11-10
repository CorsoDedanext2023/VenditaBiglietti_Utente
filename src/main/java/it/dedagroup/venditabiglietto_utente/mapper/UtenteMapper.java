package it.dedagroup.venditabiglietto_utente.mapper;

import org.springframework.stereotype.Component;

import it.dedagroup.venditabiglietto_utente.dto.request.AggiungiUtenteDto;
import it.dedagroup.venditabiglietto_utente.model.Ruolo;
import it.dedagroup.venditabiglietto_utente.model.Utente;

@Component
public class UtenteMapper {
	
	public Utente toUtenteCliente(AggiungiUtenteDto dto) {
		Utente u= new Utente();
		u.setNome(dto.getNome());
		u.setCognome(dto.getCognome());
		u.setDataDiNascita(dto.getData_di_nascita());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setTelefono(dto.getTelefono());
		u.setRuolo(Ruolo.CLIENTE);
		return u;
		}
	
	
	public Utente toUtenteVenditore(AggiungiUtenteDto dto) {
		Utente u= new Utente();
		u.setNome(dto.getNome());
		u.setCognome(dto.getCognome());
		u.setDataDiNascita(dto.getData_di_nascita());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setTelefono(dto.getTelefono());
		u.setRuolo(Ruolo.VENDITORE);
		return u;
		}
	
	public Utente toUtenteAdmin(AggiungiUtenteDto dto) {
		Utente u= new Utente();
		u.setNome(dto.getNome());
		u.setCognome(dto.getCognome());
		u.setDataDiNascita(dto.getData_di_nascita());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setTelefono(dto.getTelefono());
		u.setRuolo(Ruolo.ADMIN);
		return u;
		}
	
	public Utente toUtenteSuperAdmin(AggiungiUtenteDto dto) {
		Utente u= new Utente();
		u.setNome(dto.getNome());
		u.setCognome(dto.getCognome());
		u.setDataDiNascita(dto.getData_di_nascita());
		u.setEmail(dto.getEmail());
		u.setPassword(dto.getPassword());
		u.setTelefono(dto.getTelefono());
		u.setRuolo(Ruolo.SUPER_ADMIN);
		return u;
		}
	

}
