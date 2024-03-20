package com.etecja.testingspringbootapplication;


import java.util.Date;

public class Cursos {
	private Integer cod_curso;
	private String nome;
	private String ativo;
	private Date dt_ativacao;
	private Date dt_desativacao;
	
	
	public Integer getCod_curso() {
		return cod_curso;
	}
	public void setCod_curso(Integer cod_curso) {
		this.cod_curso = cod_curso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}
	public Date getDt_ativacao() {
		return dt_ativacao;
	}
	public void setDt_ativacao(Date dt_ativacao) {
		this.dt_ativacao = dt_ativacao;
	}
	public Date getDt_desativacao() {
		return dt_desativacao;
	}
	public void setDt_desativacao(Date dt_desativacao) {
		this.dt_desativacao = dt_desativacao;
	}
	public Cursos(Integer cod_curso, String nome, String ativo, Date dt_ativacao, Date dt_desativacao) {
		
		this.cod_curso = cod_curso;
		this.nome = nome;
		this.ativo = ativo;
		this.dt_ativacao = dt_ativacao;
		this.dt_desativacao = dt_desativacao;
	}
	
	public Cursos() {
		
	}
	
	
	

}
