package informacoes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.junit.Test;

public class test {
	
@Test
public void cad() {
	 ArrayList<Cadastro> cadastros = new ArrayList<>();
		Cadastro cadastro = new Cadastro();
	 String cpf = JOptionPane.showInputDialog("Digite o CPF");
/*	 
    cadastro.setCpf(cpf);
	cadastro.
	cadastro.getSexo();
	cadastro.getIdade();
	// etc.

	cadastros.add(cadastro);
	*/
	System.out.println(Cadastro.getCpf());
}
}