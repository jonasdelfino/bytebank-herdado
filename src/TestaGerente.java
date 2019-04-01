
public class TestaGerente {

	public static void main(String[] args) {
		

		
		
		Gerente g1 = new Gerente();
		g1.setNome("Jonas");
		g1.setCpf("999.999.999-99");
		g1.setSalario(5000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(123456);
		boolean autentica = g1.autentica(123456);
		
		System.out.println(autentica);
		
		System.out.println(g1.getBonificacao());
	}

}
