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

	@NotNull(message = "Insert a value on field name")
	@Pattern(regexp = "^[\\p{L} '-]+$", message = "Insert a valid name")
	private String nome;
	@NotNull(message = "Insert a value on field surname")
	@Pattern(regexp = "^[\\p{L} '-]+$", message = "Insert a valid surname")
	private String cognome;
	@NotEmpty(message="Username cannot be empty")
	@Email
	private String email;
	@NotEmpty(message="Password cannot be empty")
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")
	private String password;
	@NotEmpty(message="Taxcode cannot be empty")
	@Pattern(regexp = "[a-zA-Z]{6}[0-9]{2}[a-zA-Z][0-9]{2}[a-zA-Z][0-9]{3}[a-zA-Z]")
	private String telefono;
	@NotBlank(message="la data di nascita non è valida")
	private LocalDate data_di_nascita;
	
	
	
}
