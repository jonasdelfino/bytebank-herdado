
public class TestaSistema {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setSenha(2222);

		Administrador adm = new Administrador();
		adm.setSenha(2222);
		
		Cliente cl = new Cliente();
		cl.setSenha(2222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(gerente);
		si.autentica(adm);
		si.autentica(cl);

	}

}
