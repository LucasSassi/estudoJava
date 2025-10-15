public class Banco {

    static class ContaBancaria {
        private String titular;
        private double saldo;
        private String numeroConta;

        public ContaBancaria(String titular, double saldo, String numeroConta) {
            this.titular = titular;
            this.saldo = saldo;
            this.numeroConta = numeroConta;
        }
        public String getTitular() {
            return this.titular;
        }

        public String getNumeroConta() {
            return this.numeroConta;
        }

        public double getSaldo() {
            return this.saldo;
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }
    }

    public static void main(String[] args) {


        ContaBancaria contaBancaria1 = new ContaBancaria("Alice", 1000.0, "12345-6");
        ContaBancaria contaBancaria2 = new ContaBancaria("Bob", 500.0, "65432-1");
        System.out.println("--- Saldos Iniciais ---");

        System.out.println(contaBancaria1.getTitular() + " tem saldo de: " + contaBancaria1.getSaldo());
        System.out.println(contaBancaria2.getTitular() + " tem saldo de: " + contaBancaria2.getSaldo());

        System.out.println("\n--- Depósitos ---");
        contaBancaria1.depositar(200.0);

        System.out.println("\n--- Saldos Atualizados ---");
        System.out.println(contaBancaria1.getTitular() + " tem saldo de: " + contaBancaria1.getSaldo());
        System.out.println(contaBancaria2.getTitular() + " tem saldo de: " + contaBancaria2.getSaldo());

        System.out.println("\n--- Novos Depositos ---");
        contaBancaria2.depositar(-5434.87);

        System.out.println("\n--- Saldos Finais ---");
        System.out.println(contaBancaria1.getTitular() + " tem saldo de: " + contaBancaria1.getSaldo());
        System.out.println(contaBancaria2.getTitular() + " tem saldo de: " + contaBancaria2.getSaldo());

        System.out.println(contaBancaria1.getNumeroConta() + " PERTENCE A " + contaBancaria1.getTitular());
        System.out.println(contaBancaria2.getNumeroConta() + " PERTENCE A " + contaBancaria2.getTitular());
    }

}