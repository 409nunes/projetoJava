package exercio2;

import java.util.ArrayList;
import java.util.List;

public class CaixaTeste {

	

	public static void main(String[] args) {
		
		List<Caixa<String>> listaCaixa = new ArrayList<>();
		
		
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.setNome("Segredo");		
		
		Caixa<String> caixaB = new Caixa<>();
		caixaB.setNome("Nunes");
		
		
		listaCaixa.add(caixaA);
		listaCaixa.add(caixaB);
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);	
		
		
		System.out.println(caixaB);
		System.out.println("ola mundo2");
		System.out.println(listaCaixa);

	}

}
