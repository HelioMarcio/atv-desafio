/*
 * Aluno: Helio Marcio
 * Disciplina: Arquitetura de Sistemas
 * 
 */

public class Detetive implements Observer{

	
	public void frente() {
		System.out.println("Detetive o segue.");		
	}

	public void esquerda() {
		System.out.println("Detetive o persegue pela esquerda.");
	}

	public void direita() {
		System.out.println("Detetive o persegue pela direita.");
	}

	public void para() {
		System.out.println("Detetive encontra suspeito.");
	}
	
	@Override
	public void update(Object acao) {
		
		if(acao.equals("frente")) {
			this.frente();
		}else if(acao.equals("direita")) {
			this.direita();
		}else if(acao.equals("esquerda")) {
			this.esquerda();
		}else if(acao.equals("para")) {
			this.para();
		}	
	}

}
