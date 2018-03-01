package org.pimentel.digitalteacher.controller;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.pimentel.digitalteacher.dao.ConfiguracaoInicialDAO;
import org.pimentel.digitalteacher.model.ConfiguracaoInicial;
import org.pimentel.digitalteacher.util.Util;

public class ConfiguracaoInicialController implements Serializable{
	
	private static final long serialVersionUID = 309798460543645388L;
	
	public ConfiguracaoInicialController() {
		super();
	}
	
	public boolean testaConexaoBD() throws ClassNotFoundException, SQLException, IOException {		 
		@SuppressWarnings("unused")
		Connection connection;
		ArrayList<String> aux = Util.dadosPersistenceXML();		
		String[] driver = aux.get(1).split("=");	
		String[] url = aux.get(2).split("=");
		String[] usuario = aux.get(3).split("=");
		String[] senha = aux.get(4).split("=");
	    try {	        
	        Class.forName(driver[1]);
	        connection = DriverManager.getConnection(url[1], usuario[1], senha[1]); 
	        return true;
	    } catch (ClassNotFoundException ex) {
	    	ex.getMessage(); 
	    } catch (SQLException ex) {
	    	ex.getMessage();
	    }	    
	    return false;
	}
	
	public ConfiguracaoInicial carregaConfiguracaoInicial() {
		ConfiguracaoInicial configuracaoInicial = new ConfiguracaoInicial();
		ConfiguracaoInicialDAO configuracaoInicialDAO = new ConfiguracaoInicialDAO();		
		List<ConfiguracaoInicial> configAUX = configuracaoInicialDAO.findAll();
		configuracaoInicial = configAUX.get(configAUX.size()-1);
		return configuracaoInicial;
	}
	
	
	
	
}
