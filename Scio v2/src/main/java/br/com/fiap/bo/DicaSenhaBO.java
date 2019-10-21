package br.com.fiap.bo;

public class DicaSenhaBO {

	public static boolean  incluir (String pDica)
	{
		boolean resultado = false;
	
	try {		
if(pDica.length() >= 10) {
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
