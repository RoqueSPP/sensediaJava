package informacoes;



public class Cadastro {

	static  private String cpf;
	    private String nome;
	    private String sexo;
	    private int idade;
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public void setSexo(String sexo) {
			this.sexo = sexo;
		}
		public void setIdade(int idade) {
			this.idade = idade;
		}
		public static String getCpf() {
			return cpf;
		}
	    
	
	
}
