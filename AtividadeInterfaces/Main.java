package AtividadeInterfaces;

interface Pagamento {
    void pagar(double valor);
}

class Pix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PIX.");
    }
}

class Cartao implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via cartão.");
    }
}

class ProcessadorPagamento {

    public void processar(Pagamento pagamento, double valor) {
        pagamento.pagar(valor);
    }
}

public class Main {

    public static void main(String[] args) {

        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pagamento pix = new Pix();
        Pagamento cartao = new Cartao();

        processador.processar(pix, 100.0);
        processador.processar(cartao, 250.0);
    }
}