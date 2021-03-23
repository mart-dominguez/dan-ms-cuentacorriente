package dan.tp2021.cuentacorriente.domain;

import java.time.Instant;

public class Cheque extends MedioPago {

	private Integer nroCheque;
	private Instant fechaCobro;
	private String banco;
	
	public Integer getNroCheque() {
		return nroCheque;
	}
	public void setNroCheque(Integer nroCheque) {
		this.nroCheque = nroCheque;
	}
	public Instant getFechaCobro() {
		return fechaCobro;
	}
	public void setFechaCobro(Instant fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
