package it.dedagroup.venditabiglietto_utente.dto.request;

import java.time.LocalDate;

import it.dedagroup.venditabiglietto_utente.model.Ruolo;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AggiungiUtenteDto {

	@NotNull(message = "Inserire un valore nel campo nome")
	@Pattern(regexp = "^[\\p{L} '-]+$", message = "Inserire un nome valido")
	private String nome;
	@NotNull(message = "Inserire un valore nel campo cognome")
	@Pattern(regexp = "^[\\p{L} '-]+$", message = "Inserire un cognome valido")
	private String cognome;
	@NotEmpty(message="Il campo username non può essere vuoto")
	@Email
	private String email;
	@NotEmpty(message="Il campo password non  può essere vuoto")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", 
			message = "La password deve avere almeno 8 caratteri. "
			+ "Non deve contenere spazi bianchi. "
			+ "Deve contenere almeno una lettera maiuscola.\r\n"
			+ "Deve contenere almeno una lettera minuscola.\r\n"
			+ "Deve contenere almeno un numero.\r\n"
			+ "Deve contenere almeno un carattere speciale tra @, #, $, %, ^, &, +, =.")
	private String password;
	@NotEmpty(message="Il campo telefono non può essere vuoto")
	@Pattern(regexp = "[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]")
	private String telefono;
	@NotBlank(message="la data di nascita non è valida")
	private LocalDate data_di_nascita;
	
	
	
}
