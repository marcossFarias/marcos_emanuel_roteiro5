package tad.listasEncadeadas;

public class NodoListaEncadeada<T extends Comparable<T>> {
    private T chave;
    private NodoListaEncadeada<T> proximo;

    public NodoListaEncadeada(T chave) {
        this.chave = chave;
        this.proximo = null;
    }

    public T getChave() {
        return chave;
    }

    public NodoListaEncadeada<T> getProximo() {
        return proximo;
    }

    public void setProximo(NodoListaEncadeada<T> proximo) {
        this.proximo = proximo;
    }
}

