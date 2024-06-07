public class App {
    public static void main(String[] args) throws Exception {

        Cliente c = new Cliente();

        System.out.println(" ---------- Bem Vindo ao Banco Digital ---------- ");
        
		c.setNome("Thiago Pratti de Mendonca");
		
		Conta cc = new ContaCorrente(c);
		Conta poupanca = new ContaPoupanca(c);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

    }
}
