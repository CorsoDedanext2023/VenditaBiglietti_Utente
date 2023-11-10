package it.dedagroup.venditabiglietto_utente.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import it.dedagroup.venditabiglietto_utente.model.Ruolo;
import it.dedagroup.venditabiglietto_utente.model.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Long>  {
	
		public Optional<Utente> findByEmailAndPassword(String email, String password);
		public Optional<Utente> findByTelefono(String telefono);
		public Optional<Utente> findByDataDiNascita(LocalDate dataDiNascita);
		public Optional<Utente> findByNomeAndCognome(String nome, String cognome);
		public Optional<Utente> findByRuolo(Ruolo ruolo);
		public Optional<Utente> findByNomeAndCognomeAndIsAvailableTrue(String nome, String cognome);
		//fare altre query
		
}
