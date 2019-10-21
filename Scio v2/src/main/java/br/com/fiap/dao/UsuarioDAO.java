package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fiap.beans.Usuario;
import br.com.fiap.conexao.ConexaoFactory;

/**
 * Esta classe foi criada para fazer o CRUD com o banco de dados
 * @author Danielle, Guilherme
 *
 */

public class UsuarioDAO {


		private Connection conexao;
		
		public UsuarioDAO() throws Exception {
			this.conexao = new ConexaoFactory().getConnection();
		}
		
		public void gravar(Usuario u) throws Exception {
			String sql = "insert into TB_USUARIO " + "(CD_USER, NM_USER, LG_USER, SN_USER, ST_USER, CPF_USER, SX_USER , EMAIL_USER) values (?,?,?,?,?,?,?,?)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		estrutura.setInt(1, u.getCd_usuario());
		estrutura.setString(2, u.getNm_usuario());
		estrutura.setString(3, u.getLg_usuario());
		estrutura.setString(4, u.getSn_usuario());
		estrutura.setString(5, u.getSt_usuario());
		estrutura.setString(6, u.getCpf_usuario());
		estrutura.setString(7, u.getSx_usuario());
		estrutura.setString(8, u.getEmail_usuario());
		estrutura.execute();
		estrutura.close();
		}

	public Usuario getPesquisarUsuario(String strUsuario) throws Exception {
		
		Usuario u = new Usuario();
		PreparedStatement estrutura = this.conexao.prepareStatement("select * from TB_USUARIO where CD_USER = ?");
		estrutura.setString(1, strUsuario);
		ResultSet resultadoDados = estrutura.executeQuery();
		if(resultadoDados.next()) {
			u.setCd_usuario(resultadoDados.getInt("CD_USER"));
			u.setNm_usuario(resultadoDados.getString("NM_USER"));
			u.setLg_usuario(resultadoDados.getString("LG_USER"));
			u.setSn_usuario(resultadoDados.getString("SN_USER"));
			u.setSt_usuario(resultadoDados.getString("ST_USER"));
			u.setCpf_usuario(resultadoDados.getString("CPF_USER"));
			u.setSx_usuario(resultadoDados.getNString("SX_USER"));
			u.setEmail_usuario(resultadoDados.getString("EMAIL_USER"));
			
		}
		resultadoDados.close();
		estrutura.close();
		return u;
		}
		
		public int apagar(String x) throws Exception{
			PreparedStatement stmt = conexao.prepareStatement
		    ("delete from TB_USUARIO where CD_USER = ?");
			stmt.setString(1, x);
			int saida = stmt.executeUpdate();
			stmt.close();
			return saida;
		}
		
		public int atualizar(String strNome, String strLogin, String strSenha, String strCPF, String strSexo,String strEmail) throws Exception{
			PreparedStatement stmt = conexao.prepareStatement
					("update TB_USUARIO set NM_USER = ?, LG_USER = ?, SN_USER = ?, ST_USER = ?, CPF_USER = ?, SX_USER = ?, EMAIL_USER = ? WHERE CD_USER = ?");
			stmt.setString(1, strNome);
			stmt.setString(2, strLogin);
			stmt.setString(3, strSenha);
			stmt.setString(4, strCPF);
			stmt.setString(5, strSexo);
			stmt.setString(6, strEmail);
			int saida = stmt.executeUpdate();
			stmt.close();
			return saida;
		}
	
	
	
	
}
