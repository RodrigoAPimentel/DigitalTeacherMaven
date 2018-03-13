package org.pimentel.digitalteacher.dao;

import java.util.List;

import org.pimentel.digitalteacher.model.Pessoa;

public class PessoaDAO extends DAOGeneric<Pessoa, Integer>{
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findStatus(Boolean status) {		
		List<Pessoa> l = (List<Pessoa>) executeQuery("FROM Pessoa WHERE status = ?0 ORDER BY idPessoa asc", status);		
		return l;		
	}
	
}
