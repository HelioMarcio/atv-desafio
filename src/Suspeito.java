/*
 * Aluno: Helio Marcio
 * Disciplina: Arquitetura de Sistemas
 * 
 */

import java.util.ArrayList;
import java.util.List;

public class Suspeito implements Observable{

	private String acao = "";
	private List <Observer> observers;

	public Suspeito() {
		observers = new ArrayList<>();
	}
	public void setAcao(String acao) {
		this.acao = acao;
		this.notifyObservers();
	}
	
	@Override
	public void desconfiaObserver(Observer ob) {
		observers.add(ob);		
	}
	@Override
	public void fogeObserver(Observer ob) {
		observers.remove(ob);
		System.out.println("Suspeito foge do detetive.");
	}
	
	@Override
	public void notifyObservers() {
		for(Observer o : observers){
			if(acao.equals("frente")) {
				System.out.println("Suspeito segue em frente.");
			}else if(acao.equals("direita")) {
				System.out.println("Suspeito segue pela direita.");
			}else if(acao.equals("esquerda")) {
				System.out.println("Suspeito segue pela esquerda.");
			}else if(acao.equals("para")) {
				System.out.println("Suspeito para.");
			}
            o.update(acao);
        }		
	}	
}
