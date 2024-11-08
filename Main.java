public class Main {
  public static void main(String[] args) {
    Conta cc = new ContaCorrente();
    cc.depositar(1000);

    Conta cp = new ContaPoupanca();
    cc.transferir(cp, 500);

    cc.imprimirExtrato();
    cp.imprimirExtrato();
  }
}
