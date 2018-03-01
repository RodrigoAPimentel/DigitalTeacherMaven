package org.pimentel.digitalteacher.controller;

import java.io.Serializable;
import java.util.List;

import org.pimentel.digitalteacher.dao.UsuarioDAO;
import org.pimentel.digitalteacher.model.ConfiguracaoInicial;
import org.pimentel.digitalteacher.teste.Usuario;

public class UsuarioController implements Serializable {
	
	private static final long serialVersionUID = -5157499288853913588L;
	
	private static Usuario usuario;
	private UsuarioDAO usuarioDAO;

	public UsuarioController() {
		super();
		usuario = new Usuario();
		usuarioDAO = new UsuarioDAO();
	}

	public static Usuario getUsuario() {
		return usuario;
	}

	public static void setUsuario(Usuario usuario) {
		UsuarioController.usuario = usuario;
	}
	
	public Boolean logar(String login, String senha) {	
		List<Usuario> listUser = usuarioDAO.findAll();
		if(login.equals(ConfiguracaoInicial.getUsuariomaster()) && senha.equals(ConfiguracaoInicial.getSenhamaster())) {
			usuario.setGrupoAcesso("Master");
			usuario.setLogin(login);
			usuario.setNivelAcesso(0);
			usuario.setSenha(senha);
			usuario.setStatus(true);
			return true;
		}else {
			for(Usuario user : listUser) {
				if (login.equals(user.getLogin()) && senha.equals(user.getSenha())) {					
					usuario.setGrupoAcesso(user.getGrupoAcesso());
					usuario.setLogin(login);
					usuario.setNivelAcesso(user.getNivelAcesso());
					usuario.setSenha(senha);
					usuario.setStatus(user.getStatus());
					usuario.setPessoa(user.getPessoa());
					return true;
				}
			}
		}		
		usuario.setGrupoAcesso("");
		usuario.setLogin("");
		usuario.setNivelAcesso(-1);
		usuario.setSenha("");
		usuario.setStatus(false);		
		return false;
	}
	

}
