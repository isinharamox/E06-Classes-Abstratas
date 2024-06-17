public class ContaCorrente extends Conta {

    public ContaCorrente (int numero, Cliente dono, double saldo, double limite) {
        super (numero, dono, saldo, limite);
    }
    public void setlimite (double limite) {
        if (limite <= -100) {
            super.limite = -100;
            return false;
        } else {
            super.limite = limite;
            return true;
        }
    }
}
