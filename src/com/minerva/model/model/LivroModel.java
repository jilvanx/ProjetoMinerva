package com.minerva.model.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="livro")
public class LivroModel implements Serializable {

	/**
	 * 
	*/
	private static final long serialVersionUID = 1L;

	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //identity(1,1)
	@Column(name="codigo")
	Integer codigo;
	
	@Column(name="titulo", length=100, nullable=false)
	String titulo;
	
	@Column(name="autor", length=50, nullable=false)
	String autor;
	
	@Column(name="ano", nullable=false)
	Integer ano;
	
	@Column(name="local", length=200, nullable=false)
	String local;
	
	@Column(name="quantidade", nullable=false)
	Integer quantidade;
	
	public LivroModel(){
		
	}
	
	
	public LivroModel(Integer codigo, String titulo, String autor, Integer ano, String local, Integer quantidade) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.local = local;
		this.quantidade = quantidade;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LivroModel other = (LivroModel) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	
	
}
