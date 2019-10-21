package br.com.fiap.beans;

/**
 * Esta classe foi criada para instanciar objetos Materia
 * @author Danielle, Guilherme
 *
 */

public class Materia {

	private int cd_materia;
	private String nm_materia, ds_materia;
	
	
	public Materia(int cd_materia, String nm_materia, String ds_materia) {
		setCd_materia(cd_materia);
		setNm_materia(nm_materia);
		setDs_materia(ds_materia);
	}
	
	public int getCd_materia() {
		return cd_materia;
	}
	public void setCd_materia(int cd_materia) {
		this.cd_materia = cd_materia;
	}
	public String getNm_materia() {
		return nm_materia;
	}
	public void setNm_materia(String nm_materia) {
		this.nm_materia = nm_materia;
	}
	public String getDs_materia() {
		return ds_materia;
	}
	public void setDs_materia(String ds_materia) {
		this.ds_materia = ds_materia;
	}
	
	
	
	
}
