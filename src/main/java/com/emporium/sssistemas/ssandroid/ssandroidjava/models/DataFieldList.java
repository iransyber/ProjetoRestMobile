package com.emporium.sssistemas.ssandroid.ssandroidjava.models;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataFieldList  implements Serializable {

	private static final long serialVersionUID = 1L;
	@JsonProperty("UniqueID")
	private String UniqueID;
	
	@JsonProperty("Unidade")
    private String Unidade;
	
	@JsonProperty("Localizacao")
    private String Localizacao;
	
	@JsonProperty("Atendimento")
    private String Atendimento;
	
	@JsonProperty("Itens")
    private List<Itens> Itens;
	
	@JsonProperty("Cliente")
    private String Cliente;
    
    @JsonProperty("Garcon")
    private String Garcon;
    
    @JsonProperty("Observacoes")
    private String Observacoes;
    
    @JsonProperty("Produto")
    private String Produto;
    
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
    @JsonProperty("Unidade")
    public String getUnidade ()
    {
        return Unidade;
    }
    @JsonProperty("Unidade")
    public void setUnidade (String Unidade)
    {
        this.Unidade = Unidade;
    }
    @JsonProperty("Localizacao")
    public String getLocalizacao ()
    {
        return Localizacao;
    }
    @JsonProperty("Localizacao")
    public void setLocalizacao (String Localizacao)
    {
        this.Localizacao = Localizacao;
    }
    @JsonProperty("Atendimento")
    public String getAtendimento ()
    {
        return Atendimento;
    }
    @JsonProperty("Atendimento")
    public void setAtendimento (String Atendimento)
    {
        this.Atendimento = Atendimento;
    }
    @JsonProperty("Itens")
    public List<Itens> getItens ()
    {
        return Itens;
    }
    @JsonProperty("Itens")
    public void setItens (List<Itens> Itens)
    {
        this.Itens = Itens;
    }
    @JsonProperty("Cliente")
    public String getCliente ()
    {
        return Cliente;
    }
    @JsonProperty("Cliente")
    public void setCliente (String Cliente)
    {
        this.Cliente = Cliente;
    }
    @JsonProperty("Garcon")
    public String getGarcon ()
    {
        return Garcon;
    }
    @JsonProperty("Garcon")
    public void setGarcon (String Garcon)
    {
        this.Garcon = Garcon;
    }
    @JsonProperty("Observacoes")
    public String getObservacoes ()
    {
        return Observacoes;
    }
    @JsonProperty("Observacoes")
    public void setObservacoes (String Observacoes)
    {
        this.Observacoes = Observacoes;
    }
    @JsonProperty("Produto")
    public String getProduto ()
    {
        return Produto;
    }
    @JsonProperty("Produto")
    public void setProduto (String Produto)
    {
        this.Produto = Produto;
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
        return "DataFieldClass [UniqueID = "+UniqueID+", Unidade = "+Unidade+", Localizacao = "+Localizacao+", Atendimento = "+Atendimento+", Itens = "+Itens+", Cliente = "+Cliente+", Garcon = "+Garcon+", Observacoes = "+Observacoes+", Produto = "+Produto+", Quantidade = "+Quantidade+"]";
    }
	
}
