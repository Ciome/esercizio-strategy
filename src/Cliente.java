
public class Cliente {
	private MetodoPagamento mp;
	
	public void setMetodoPagamento(MetodoPagamento mp) {
		this.mp = mp;
	}
	
	public void paga() {
		if (mp != null) System.out.println("Pagamento con " + mp.restituisciMetodoPagamento());
		else System.out.println("Nessun metodo di pagamento impostato");
	}
}
