package br.com.fiap.bo;

public class UsuarioBO {

	public static boolean  incluir (String pNome, String pLogin, String pSenha)
	{
		boolean resultado = false;
	
	try {		
if(pLogin.length() >=3 && pSenha.length() >= 8 && pNome.length() >=4) {
	resultado = true;
}
else {
	resultado = false;
}
return resultado;
	} catch (Exception e) {
		System.out.print("Erro: ");
		e.printStackTrace();
	}
return resultado;
}
	
}
