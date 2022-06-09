package exercio2;

public class Caixa<T> {

	private T nome;
	private T idade;
	private T coisa;

	public void aguardar(T coisa) {
		this.coisa = coisa;
	}

	public T abrir() {
		return coisa;
	}

	public T getNome() {
		return nome;
	}

	public void setNome(T nome) {
		this.nome = nome;
	}

	public T getIdade() {
		return idade;
	}

	public void setIdade(T idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return String.format("Caixa [nome=%s, idade=%s, coisa=%s]", nome, idade, coisa);
	}
	

}
