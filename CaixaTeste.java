package exercici;

class CaixaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<String> caixaB = new Caixa<>();
		caixaB.guardar("Segredo!");
		
		String coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		System.out.println("Ola mundo novo");
	}

}
