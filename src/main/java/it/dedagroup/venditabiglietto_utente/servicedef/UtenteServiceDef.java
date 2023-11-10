package it.dedagroup.venditabiglietto_utente.servicedef;


import it.dedagroup.venditabiglietto_utente.model.Ruolo;
import it.dedagroup.venditabiglietto_utente.model.Utente;

public interface UtenteServiceDef {
	
	Utente findByEmailAndPassword(String email, String password);
	Utente findByTelefono(String telefono);
	Utente findByData_Di_Nascita(String data_di_nascita);
	Utente findByNomeAndCognome(String nome, String cognome);
	Utente findByRuolo(Ruolo ruolo);
	void aggiungiUtente(Utente utente);
	Utente modificaUtente(Utente utente);
	Utente eliminaUtente(Utente utente);

}
