/*
 * Aluno: Helio Marcio
 * Disciplina: Arquitetura de Sistemas
 * 
 */

public class mainPerseguicao {

	public static void main(String[] args) {
		// Observador
		Detetive detetive = new Detetive();
		
		// Observado
		Suspeito suspeito = new Suspeito();
		
		// adicionando o observador ao observado
		suspeito.desconfiaObserver(detetive);
		
		// acoes do observado
		suspeito.setAcao("frente");
		System.out.println();
		suspeito.setAcao("esquerda");
		System.out.println();
		suspeito.setAcao("para");
		System.out.println();
		
		// removendo o observador do observado
		suspeito.fogeObserver(detetive);
	}

}
