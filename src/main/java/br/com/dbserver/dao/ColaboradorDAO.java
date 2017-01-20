package br.com.dbserver.dao;

import br.com.dbserver.dto.Colaborador;

public class ColaboradorDAO extends GenericDao<Colaborador, Long> {

	public ColaboradorDAO() {
		super(Colaborador.class);
	}
	
}
