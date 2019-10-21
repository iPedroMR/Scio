//package br.com.fiap.servers;
//
//import java.io.IOException;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import br.com.fiap.dao.UsuarioDAO;
//
///**
// * Servlet implementation class Login
// */
//@WebServlet("/login")
//public class Login extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	/**
//	 * @see HttpServlet#HttpServlet()
//	 */
//	public Login() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String email = request.getParameter("email");
//		String senha = request.getParameter("senha");
//	
//		Login login = new Login();
//		
//		
//		try {		
//			loginEmail(email);	
//			login.setSenha(senha);
//			if(login.verifica()=="true") {
//				try {
//					UsuarioDAO dao = new UsuarioDAO();
//					dao.gravar(login);
//					System.out.println("autenticado");
//					response.sendRedirect(request.getContextPath() + "/menuAluno.jsp");
//				} catch (Exception e) {
//					System.out.println(e);
//					response.sendRedirect("/login.jsp");
//				}
//				else {
//					response.sendRedirect(request.getContextPath() + "/login.jsp");
//				}
//			} catch (Exception e) {
//				System.out.println("err" + e);
//				cadastro.setStatus("false");
//				response.sendRedirect(request.getContextPath() + "/login.jsp");
//			}
//		}
//
//	public static void main(String[] args) {
//
//	}
//
//}