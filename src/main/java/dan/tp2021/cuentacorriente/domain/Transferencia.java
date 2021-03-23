package dan.tp2021.cuentacorriente.domain;

public class Transferencia extends MedioPago {

	private String cbuOrigen;
	private String cbuDestino;
	private Long codigoTransferencia;
	
	public Long getCodigoTransferencia() {
		return codigoTransferencia;
	}
	public void setCodigoTransferencia(Long codigoTransferencia) {
		this.codigoTransferencia = codigoTransferencia;
	}
	public String getCbuOrigen() {
		return cbuOrigen;
	}
	public void setCbuOrigen(String cbuOrigen) {
		this.cbuOrigen = cbuOrigen;
	}
	public String getCbuDestino() {
		return cbuDestino;
	}
	public void setCbuDestino(String cbuDestino) {
		this.cbuDestino = cbuDestino;
	}
	
	
}
