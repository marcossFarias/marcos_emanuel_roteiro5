package tad.fila;

public class MinhaFila<E> implements FilaIF<E> {
    @Override
    public void enfileirar(E item) throws FilaCheiaException {

    }

    @Override
    public E desenfileirar() throws FilaVaziaException {
        return null;
    }

    @Override
    public E verificarCauda() {
        return null;
    }

    @Override
    public E verificarCabeca() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
