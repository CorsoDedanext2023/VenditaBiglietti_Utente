package it.dedagroup.venditabiglietto_utente.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String cognome;
	@Column(nullable = false)
	private LocalDate data_di_nascita;
	@Column(nullable = false)
	private Ruolo ruolo;
	@Column(nullable = false , unique = true)
	private String email;
	@Column(nullable = false)
	private String password;
	@Column
	private String telefono;
	@Column
	private boolean isAvailable;
	//@Column
	//private List<Long> id_manifestazione;

}
