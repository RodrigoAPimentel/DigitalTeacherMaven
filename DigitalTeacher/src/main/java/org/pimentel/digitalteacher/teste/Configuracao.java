package org.pimentel.digitalteacher.teste;

import java.io.Serializable;

import org.pimentel.digitalteacher.util.BaseBean;

public class Configuracao extends BaseBean implements Serializable{

	private static final long serialVersionUID = -5339759027315379459L;
	
	private Integer id;
	private String nome;
	private String versao;
	private byte[] planoFundo;
	private String serial;
	private byte[] icone;
	
	private static final String usuarioMaster = "";
	private static final String senhaMaster = "";
	
	public Configuracao() {
		super();
	}

	public Configuracao(Integer id, String nome, String versao, byte[] planoFundo, String serial, byte[] icone) {
		super();
		this.id = id;
		this.nome = nome;
		this.versao = versao;
		this.planoFundo = planoFundo;
		this.serial = serial;
		this.icone = icone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public byte[] getPlanoFundo() {
		return planoFundo;
	}

	public void setPlanoFundo(byte[] planoFundo) {
		this.planoFundo = planoFundo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public byte[] getIcone() {
		return icone;
	}

	public void setIcone(byte[] icone) {
		this.icone = icone;
	}

	public static String getUsuariomaster() {
		return usuarioMaster;
	}

	public static String getSenhamaster() {
		return senhaMaster;
	}
	
}
