package br.com.sincon.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Taxa implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 954669836264873397L;
	
	private Long id;
	private BigDecimal valor;
	private int pago;
	private String taxaCol;
	private Condominio taxaCondominio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public int getPago() {
		return pago;
	}
	public void setPago(int pago) {
		this.pago = pago;
	}
	public String getTaxaCol() {
		return taxaCol;
	}
	public void setTaxaCol(String taxaCol) {
		this.taxaCol = taxaCol;
	}
	public Condominio getTaxaCondominio() {
		return taxaCondominio;
	}
	public void setTaxaCondominio(Condominio taxaCondominio) {
		this.taxaCondominio = taxaCondominio;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Taxa other = (Taxa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
