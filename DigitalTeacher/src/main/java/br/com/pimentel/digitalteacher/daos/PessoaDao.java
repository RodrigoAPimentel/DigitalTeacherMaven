package br.com.pimentel.digitalteacher.daos;

import java.util.List;

import br.com.pimentel.digitalteacher.models.Pessoa;
import br.com.pimentel.digitalteacher.utils.GenericDao;

public class PessoaDao extends GenericDao<Pessoa, String>{
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> findStatus(Boolean status) {		
		List<Pessoa> l = (List<Pessoa>) executeQuery("FROM Pessoa WHERE status = ?0 ORDER BY idPessoa asc", status);		
		return l;		
	}
	
}
