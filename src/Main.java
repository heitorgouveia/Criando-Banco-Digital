public class Main {
    public static void main(String[] args) {
       Cliente cliente = new Cliente();

       cliente.setNome("Heitor");

       ContaCorrente cc = new ContaCorrente(cliente);

       Cliente cliente2 = new Cliente();
       cliente2.setNome("Bruno");

       ContaCorrente cc2 = new ContaCorrente(cliente2);

       cc.imprimirInfos();
       cc2.imprimirInfos();

       cc.depositar(1550);
       cc.imprimirExtrato();

       cc2.depositar(300);
       cc2.imprimirExtrato();

       cc.transferir(400, cc2);

       cc.imprimirExtrato();
       cc2.imprimirExtrato();

       ContaPoupança poupanca1 = new ContaPoupança(cliente);
       ContaPoupança poupanca2 = new ContaPoupança(cliente2);

       poupanca1.imprimirInfos();
       poupanca2.imprimirInfos();

       poupanca1.depositar(500);
       poupanca2.depositar(700);

       poupanca1.imprimirExtrato();
       poupanca2.imprimirExtrato();

       poupanca1.sacar(100);

       poupanca1.imprimirExtrato();

       poupanca2.transferir(500, poupanca1);

       poupanca1.imprimirExtrato();
       poupanca2.imprimirExtrato();

       Banco bc = new Banco();

       bc.adicionarContaCorrente(cliente);
       bc.adicionarContaCorrente(cliente2);



       

    }
    
}
