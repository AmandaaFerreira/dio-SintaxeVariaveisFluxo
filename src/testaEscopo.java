
public class testaEscopo {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 20;
		int quantidadePessoas = 3; 
		
		boolean acompanhado = quantidadePessoas >= 2; 
// teste 		
		if(quantidadePessoas >= 2) {
			acompanhado = true; 
		} 
		else {
			acompanhado = false; 
		}
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("Infelismente voce não pode entrar");
		}
	}
}
