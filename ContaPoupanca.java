public class ContaPoupanca extends Conta{

    public ContaPoupanca (int numero, Cliente dono, double saldo, double limite) {
        super (numero, dono, saldo, limite);
    }
    //1000 e 100
    public void setlimite (double limite) {
        if (limite < 100) {
            limite = 100;
            super.limite = limite;
            return true;
        } if (limite > 1000) {
            limite = 1000;
            super.limite = limite;
            return false;
        }
    }
}
