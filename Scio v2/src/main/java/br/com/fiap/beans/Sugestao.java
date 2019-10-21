package br.com.fiap.beans;

/**
 * Esta classe foi criada para instanciar objetos Sugestao
 * @author Danielle, Guilherme
 *
 */


public class Sugestao {

	private int cd_sugestao;
	private String ds_sugestao;
	
	public Sugestao(int cd_sugestao, String ds_sugestao) {
		setCd_sugestao(cd_sugestao);
		setDs_sugestao(ds_sugestao);
	}
	
	
	public int getCd_sugestao() {
		return cd_sugestao;
	}
	public void setCd_sugestao(int cd_sugestao) {
		this.cd_sugestao = cd_sugestao;
	}
	public String getDs_sugestao() {
		return ds_sugestao;
	}
	public void setDs_sugestao(String ds_sugestao) {
		this.ds_sugestao = ds_sugestao;
	}
	
	
	
	
	
	
}
