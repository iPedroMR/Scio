package br.com.fiap.beans;

/**
 * Esta classe foi criada para instanciar objetos Usuario
 * @author Danielle, Guilherme
 *
 */


public class Usuario {

	private int cd_usuario;

	private String nm_usuario, lg_usuario, sn_usuario, st_usuario, cpf_usuario, sx_usuario, email_usuario;

	public Usuario() {
		
	}

	public Usuario(int cd_usuario, String nm_usuario, String lg_usuario, String sn_usuario, String st_usuario,
			String cpf_usuario, String sx_usuario,String email_usuario) {
		setCd_usuario(cd_usuario);
		setNm_usuario(nm_usuario);
		setLg_usuario(lg_usuario);
		setSn_usuario(sn_usuario);
		setSt_usuario(st_usuario);
		setCpf_usuario(cpf_usuario);
		setSx_usuario(sx_usuario);
		setEmail_usuario(email_usuario);

	}

	public int getCd_usuario() {
		return cd_usuario;
	}

	public void setCd_usuario(int cd_usuario) {
		this.cd_usuario = cd_usuario;
	}

	public String getNm_usuario() {
		return nm_usuario;
	}

	public void setNm_usuario(String nm_usuario) {
		this.nm_usuario = nm_usuario;
	}

	public String getLg_usuario() {
		return lg_usuario;
	}

	public void setLg_usuario(String lg_usuario) {
		this.lg_usuario = lg_usuario;
	}

	public String getSn_usuario() {
		return sn_usuario;
	}

	public void setSn_usuario(String sn_usuario) {
		this.sn_usuario = sn_usuario;
	}

	public String getSt_usuario() {
		return st_usuario;
	}

	public void setSt_usuario(String st_usuario) {
		this.st_usuario = st_usuario;
	}

	public String getCpf_usuario() {
		return cpf_usuario;
	}

	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}

	public String getSx_usuario() {
		return sx_usuario;
	}

	public void setSx_usuario(String sx_usuario) {
		this.sx_usuario = sx_usuario;
	}
	
	public String getEmail_usuario() {
		return email_usuario;
	}

	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}


}
