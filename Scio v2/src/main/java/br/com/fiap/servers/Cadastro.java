package br.com.fiap.servers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.beans.Usuario;
import br.com.fiap.bo.UsuarioBO;
import br.com.fiap.dao.UsuarioDAO;

/**
 * Servlet implementation class Cadastro
 */
@WebServlet("/cadastro")
public class Cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public Cadastro() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		String dica_senha = request.getParameter("dica_senha");
		String sexo = request.getParameter("sexo");
		String login = request.getParameter("login");
		String cpf = request.getParameter("cpf");
				
		try {
			
			if(UsuarioBO.incluir(nome, login, senha)) {
				
				Usuario usuario = new Usuario();
				
				usuario.setNm_usuario(nome);
				usuario.setEmail_usuario(email);
				usuario.setSn_usuario(senha);
				usuario.setSx_usuario(sexo);
				usuario.setSt_usuario("Ativo");
				usuario.setLg_usuario(login);
				usuario.setCpf_usuario(cpf);
				
				try {
					UsuarioDAO dao = new UsuarioDAO();
					dao.gravar(usuario);
					System.out.println("Usu�rio gravado");
					response.sendRedirect(request.getContextPath() + "/index.jsp");
				} catch (Exception e) {
					System.out.println(e);
					response.sendRedirect("/menu.jsp");
				}
				
			}
				else {
					response.sendRedirect(request.getContextPath() + "/entrar.jsp");
				}
			} catch (Exception e) {
				System.out.println("err" + e);
				response.sendRedirect(request.getContextPath() + "/entrar.jsp");
			}
		

	}

	public static void main(String[] args) {

	}

}
