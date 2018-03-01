package org.pimentel.digitalteacher.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.pimentel.digitalteacher.util.BaseBean;

@Entity
public class ConfiguracaoInicial extends BaseBean implements Serializable{

	private static final long serialVersionUID = -5339759027315379459L;
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String versao;	
	private String planoFundoURL;
	private String iconeURL;
	private String bannerURL;	
	private String serial;
	
	@Transient
	private static final String usuarioMaster = "123";
	@Transient
	private static final String senhaMaster = "123";
	
	public ConfiguracaoInicial() {
		super();
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

	public String getPlanoFundoURL() {
		return planoFundoURL;
	}

	public void setPlanoFundoURL(String planoFundo) {
		this.planoFundoURL = planoFundo;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getIconeURL() {
		return iconeURL;
	}

	public void setIconeURL(String icone) {
		this.iconeURL = icone;
	}

	public static String getUsuariomaster() {
		return usuarioMaster;
	}

	public static String getSenhamaster() {
		return senhaMaster;
	}

	public String getBannerURL() {
		return bannerURL;
	}

	public void setBannerURL(String bannerURL) {
		this.bannerURL = bannerURL;
	}
	
}
