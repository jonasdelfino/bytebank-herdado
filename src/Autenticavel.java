
//Contrato Auntentic�vel 
	//Quem assina esse contrato, precisa implementar:
		//m�todo setSenha
			//m�todo autentica
//Interface n�o tem c�digo concreto, ent�o n�o � poss�vel criar atributos nem implementar na mesma nenhuma m�todo
//S�o apenas regras a serem seguidas pelas classes que a contrataram...
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

}
