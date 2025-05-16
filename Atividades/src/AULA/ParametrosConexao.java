package AULA;

public class ParametrosConexao {
	
private static ParametrosConexao com;
	
	private String usuario;
	private String senha;
	private String host;
	private String porta;

	private ParametrosConexao() {
		
	}
	
	public static ParametrosConexao getInstance() {
		if(com == null)
			com = new ParametrosConexao();
		return com;
	}
	

	public static ParametrosConexao getCom() {
		return com;
	}

	public static void setCom(ParametrosConexao com) {
		ParametrosConexao.com = com;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPorta() {
		return porta;
	}

	public void setPorta(String porta) {
		this.porta = porta;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ParametrosConexao [usuario=");
		builder.append(usuario);
		builder.append(", senha=");
		builder.append(senha);
		builder.append(", host=");
		builder.append(host);
		builder.append(", porta=");
		builder.append(porta);
		builder.append("]");
		return builder.toString();
	}
}
