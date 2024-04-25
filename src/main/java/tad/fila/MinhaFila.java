package tad.fila;

import java.util.NoSuchElementException;

public class MinhaFila<E> implements FilaIF<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private int capacity;

    public MinhaFila() {
        this(10);
    }

    public MinhaFila(int capacity) {
        this.head = null;
        this.tail = null;
        this.size = 0;
        this.capacity = capacity;
    }


    @Override
    public void enfileirar(E item) throws FilaCheiaException {
        if (this.isFull()) {
            throw new FilaCheiaException("fila cheia");
        }

        Node<E> newNode = new Node<>(item);
        if (this.isEmpty()) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }

        this.tail = newNode;
        this.size++;
    }

    @Override
    public E desenfileirar() throws FilaVaziaException {
        if (this.isEmpty()) {
            throw new FilaVaziaException("fila vazia");
        }

        E item = this.head.data;
        this.head = this.head.next;

        if (this.isEmpty()) {
            this.tail = null;
        }

        this.size--;

        return item;
    }

    @Override
    public E verificarCauda() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("fila vazia");
        }

        return this.tail.data;
    }

    @Override
    public E verificarCabeca() {
        if (this.isEmpty()) {
            throw new NoSuchElementException("fila vazia");
        }

        return this.head.data;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean isFull() {
        return this.size == this.capacity;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
