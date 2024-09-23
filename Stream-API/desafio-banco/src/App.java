public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setNome("Glaulher");
        cliente.setCpf("123456789");

        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.depositar(100);
        cp.sacar(20);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cp.transferir(20, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
