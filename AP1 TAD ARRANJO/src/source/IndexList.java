package source;

public interface IndexList<E> {
	public int size();

	public boolean isEmpty();

	public void add(int i, E e) throws IndexOutOfBoundsException;

	public E get(int i) throws IndexOutOfBoundsException;

	// Remove e retorna o elemento do índice i, deslocando os elementos depoi
	public E remove(int i) throws IndexOutOfBoundsException;

	// Troca o elemento de i com e, retornando o elemento que estava em i
	public E set(int i, E e) throws IndexOutOfBoundsException;
}
