package it.dedagroup.venditabiglietto_utente.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public enum Ruolo {
	
	ADMIN("ADMIN"),
	SUPER_ADMIN("SUPER_ADMIN"),
	VENDITORE("VENDITORE");
	@Getter @Setter
	private String ruolo;
	
	

}
