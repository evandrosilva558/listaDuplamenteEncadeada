package com.listaDuplamenteEncadeada;

public class NoDuplo<T> {
	

	private T  conteudo;
	private NoDuplo<T> noProximo;
	private NoDuplo<T> noPrevio;
	
	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public NoDuplo<T> getNoProximo() {
		return noProximo;
	}

	public void setNoProximo(NoDuplo<T> noProximo) {
		this.noProximo = noProximo;
	}

	public NoDuplo<T> getNoPrevio() {
		return noPrevio;
	}

	public void setNoPrevio(NoDuplo<T> noPrevio) {
		this.noPrevio = noPrevio;
	}
	
	public NoDuplo(T conteudo) {
		this.conteudo = conteudo;
	}
	
	
	@Override
	public String toString() {
		return "" + conteudo + "";
	}
	
}
