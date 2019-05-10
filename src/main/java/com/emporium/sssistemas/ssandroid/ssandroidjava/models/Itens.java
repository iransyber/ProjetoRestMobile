package com.emporium.sssistemas.ssandroid.ssandroidjava.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Itens implements Serializable {

	private static final long serialVersionUID = 1L;
	 @JsonProperty("UniqueID")
	 private String UniqueID;
	 
	 @JsonProperty("Tipo")
	 private String Tipo;
	 
	 @JsonProperty("SubProdutoID")
	 private String SubProdutoID;
	 
	 @JsonProperty("Quantidade")
	 private String Quantidade;
	 
	 @JsonProperty("UniqueID")
	    public String getUniqueID ()
	    {
	        return UniqueID;
	    }
	 @JsonProperty("UniqueID")
	    public void setUniqueID (String UniqueID)
	    {
	        this.UniqueID = UniqueID;
	    }
	 @JsonProperty("Tipo")
	    public String getTipo ()
	    {
	        return Tipo;
	    }
	 @JsonProperty("Tipo")
	    public void setTipo (String Tipo)
	    {
	        this.Tipo = Tipo;
	    }
	 @JsonProperty("SubProdutoID")
	    public String getSubProdutoID ()
	    {
	        return SubProdutoID;
	    }
	 @JsonProperty("SubProdutoID")
	    public void setSubProdutoID (String SubProdutoID)
	    {
	        this.SubProdutoID = SubProdutoID;
	    }
	 @JsonProperty("Quantidade")
	    public String getQuantidade ()
	    {
	        return Quantidade;
	    }
	 @JsonProperty("Quantidade")
	    public void setQuantidade (String Quantidade)
	    {
	        this.Quantidade = Quantidade;
	    }

	    @Override
	    public String toString()
	    {
	        return "Itens [UniqueID = "+UniqueID+", Tipo = "+Tipo+", SubProdutoID = "+SubProdutoID+", Quantidade = "+Quantidade+"]";
	    }
	    
}
