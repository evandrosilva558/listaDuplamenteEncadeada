package com.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
	

	private NoDuplo<T> primeiroNo;
	private NoDuplo<T> ultimoNo;
	
	private int tamanhoLista;
	
	public ListaDuplamenteEncadeada() {
		this.primeiroNo = null;
		this.ultimoNo = null;
		this.tamanhoLista = 0;
	}
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public void add(T elemento) {
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(null);
		novoNo.setNoPrevio(ultimoNo);
		
		if (primeiroNo == null) {
			primeiroNo = ultimoNo;
		}
		if (ultimoNo != null) {
			ultimoNo.setNoProximo(novoNo);
		}
		ultimoNo = novoNo;
		this.tamanhoLista++;
	}
	
	public void add(int index, T elemento) {
		NoDuplo<T> noAlxiliar = getNo(index);
		NoDuplo<T> novoNo = new NoDuplo<>(elemento);
		novoNo.setNoProximo(noAlxiliar);
		
		if (novoNo.getNoProximo() != null) {
			novoNo.setNoPrevio(noAlxiliar.getNoPrevio());
			novoNo.getNoProximo().setNoPrevio(novoNo);
			
		} else {
			novoNo.setNoPrevio(ultimoNo);
			ultimoNo = novoNo;
		}
		
		if (index == 0) {
			primeiroNo = novoNo;
			
		} else {
			novoNo.getNoPrevio().setNoProximo(novoNo);
			
		} this.tamanhoLista++;
	}
	
	public void remove(int index) {
		
		if (index == 0) {
			
			primeiroNo = primeiroNo.getNoProximo();
			if (primeiroNo != null) {
				primeiroNo.setNoPrevio(null);
				
			} else {
				NoDuplo<T> noAlxiliar = getNo(index);
				noAlxiliar.getNoPrevio().setNoProximo(noAlxiliar.getNoProximo());
				if (noAlxiliar != ultimoNo) {
					noAlxiliar.getNoProximo().setNoPrevio(noAlxiliar.getNoPrevio());
				} else {
					ultimoNo = noAlxiliar;
				}
			}
			
		} this.tamanhoLista--;
		
	}
	
	private NoDuplo<T> getNo(int index) {
		NoDuplo<T> noAuxiliar = primeiroNo;
		for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
			noAuxiliar = noAuxiliar.getNoProximo();
		} 
		return noAuxiliar;
	}
	
	public int size() {
		return this.tamanhoLista;
	}
	
	@Override
	public String toString() {
		String strRetorno = "";
		NoDuplo<T> noAlxiliar = primeiroNo;
		
		for (int i = 0; i < size(); i++) {
			strRetorno += "No [ conteudo =" + noAlxiliar + "] ==> ";
			noAlxiliar = noAlxiliar.getNoProximo();
			
		}
		strRetorno += "null";
		return strRetorno;
	} 
	
}
