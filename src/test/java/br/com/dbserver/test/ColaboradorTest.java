package br.com.dbserver.test;

import org.junit.Test;

import br.com.dbserver.dao.ColaboradorDAO;
import br.com.dbserver.dto.Colaborador;

public class ColaboradorTest {

	@Test
	public void ColaboradorAddTest() {
		
		Colaborador dto = new Colaborador();
		
		dto.setId(1l);
		dto.setMatricula("F1");
		dto.setNome("Jose da Silva");
		
		ColaboradorDAO dao = new ColaboradorDAO();
		
		dao.salvar(dto);
		
		
		
	}

}
