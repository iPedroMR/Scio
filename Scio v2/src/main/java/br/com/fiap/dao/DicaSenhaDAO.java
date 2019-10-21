package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.com.fiap.beans.DicaSenha;
import br.com.fiap.conexao.ConexaoFactory;

/**
 * Esta classe foi criada para fazer o CRUD com o banco de dados
 * @author Danielle, Guilherme
 *
 */

public class DicaSenhaDAO {

private Connection conexao;
	
	public DicaSenhaDAO() throws Exception {
		this.conexao = new ConexaoFactory().getConnection();
	}
	
	public void gravar(DicaSenha d) throws Exception {
		String sql = "insert into TB_DICASENHA " + "(CD_DICA, DS_DICA) values (?,?)";
	PreparedStatement estrutura = conexao.prepareStatement(sql);
	estrutura.setInt(1, d.getCd_dica());
	estrutura.setString(2, d.getDs_dica());
	estrutura.execute();
	estrutura.close();
	}
	
	public int apagar(String x) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement
	    ("delete from TB_DICASENHA where DS_DICA = ?");
		stmt.setString(1, x);
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}
	
	public int atualizar(String strDica, int intCodigo ) throws Exception{
		PreparedStatement stmt = conexao.prepareStatement
				("update TB_DICASENHA set DS_DICA = ? WHERE CD_DICA = ?");
		stmt.setString(1, strDica);
		stmt.setInt(2, intCodigo);
		int saida = stmt.executeUpdate();
		stmt.close();
		return saida;
	}
	
}
