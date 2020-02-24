package java8;

public class Cliente {

	private String nome;

	private boolean status;

	private String senha;

	public Cliente(String nome, boolean status, String senha) {
		super();
		this.nome = nome;
		this.status = status;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
