package br.com.fiap.beans;

/**
 * Esta classe foi criada para instanciar objetos DicaSenha
 * @author Guilherme, Danielle
 *
 */

public class DicaSenha {

	private int cd_dica;
	private String ds_dica;
	
	public DicaSenha(int cd_dica, String ds_dica) {
			setCd_dica(cd_dica);
			setDs_dica(ds_dica);
		}
	
	public int getCd_dica() {
		return cd_dica;
	}
	public void setCd_dica(int cd_dica) {
		this.cd_dica = cd_dica;
	}
	public String getDs_dica() {
		return ds_dica;
	}
	public void setDs_dica(String ds_dica) {
		this.ds_dica = ds_dica;
	}	
	
}
