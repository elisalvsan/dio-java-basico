package exemplo_construtor;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		
		Pessoa marcos = new Pessoa("Marcos", "15236512495");
		
		marcos.setEndereco("RUA DAS MARIAS");
		
		
		System.out.println(marcos.getNome() + " - " + marcos.getCpf() +
				" - " + marcos.getEndereco());
	}

}
