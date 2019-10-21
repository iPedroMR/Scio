package br.com.fiap.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Esta classe foi criada para fazer a conexão com o banco de dados SQL developer 
 * com a url, usuário e senha.
 * @author Danielle, Guilherme
 *
 */

public class ConexaoFactory {

	public Connection getConnection() throws Exception {
		return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","RM83557","020395");
	}
	
}
