
//Contrato Auntenticável 
	//Quem assina esse contrato, precisa implementar:
		//método setSenha
			//método autentica
//Interface não tem código concreto, então não é possível criar atributos nem implementar na mesma nenhuma método
//São apenas regras a serem seguidas pelas classes que a contrataram...
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
