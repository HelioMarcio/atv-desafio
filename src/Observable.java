/*
 * Aluno: Helio Marcio
 * Disciplina: Arquitetura de Sistemas
 * 
 */

public interface Observable {
	public void notifyObservers();
	public void desconfiaObserver(Observer ob);
	public void fogeObserver(Observer ob);
}
