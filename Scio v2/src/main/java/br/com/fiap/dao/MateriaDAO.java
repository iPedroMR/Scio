package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.beans.Materia;
import br.com.fiap.conexao.ConexaoFactory;

/**
 * Esta classe foi criada para fazer o CRUD com o banco de dados
 * @author Danielle, Guilherme
 *
 */

public class MateriaDAO {

	private Connection conexao;
	
	public MateriaDAO() throws Exception {
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void gravar(Materia m) throws Exception {
		String sql = "insert into TB_MATERIA " + "(CD_MATERIA, NM_MATERIA, DS_MATERIA) values (?,?,?)";
	PreparedStatement estrutura = conexao.prepareStatement(sql);
	estrutura.setInt(1, m.getCd_materia());
	estrutura.setString(2, m.getNm_materia());
	estrutura.setString(3, m.getDs_materia());
	estrutura.execute();
	estrutura.close();
	}
	
	public int apagar(String x) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement
	    ("delete from TB_MATERIA where CD_MATERIA = ?");
		stmt.setString(1, x);
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}
	
	
}
