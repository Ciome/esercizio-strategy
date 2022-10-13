/*
Strategy

per lo strategy puoi creare una classe Utente che ha come una variabile d'istanza di tipo MetodoPagamento
MetodoPagamento e' un interfaccia che ha per esempio un metodo restituisciMetodoPagamento che restituisce 
una stringa che dice che tipo di pagamento e puoi per esempio avere CartaCredito, PayPal, PostePay come
possibili metodi di pagamento
L'utente puo' avere un metodo che stampa il tipo di pagamento che ha e un metodo che gli permette di cambiare
il tipo di pagamento 

Concetto principale di strategy: questo pattern ti permette di modificare dinamicamente il comportamente di un oggetto, 
mentre decorator ti permettere di aggiungere dinamicamente dei comportamenti ad un oggetto
 */


public class EsercizioStrategy {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.paga();
		c.setMetodoPagamento(new PagamentoContanti());
		c.paga();
		c.setMetodoPagamento(new PagamentoPaypal());
		c.paga();
		c.setMetodoPagamento(new PagamentoCarta());
		c.paga();
	}
}

