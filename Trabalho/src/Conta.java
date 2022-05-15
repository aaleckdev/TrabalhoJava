public abstract class Conta {
    private String titular;
    private int numero_da_conta;
    private int agencia;
    private double saldo;
    
    //obter valor do saldo privado
    public double getsaldo(){
        return this.saldo;
    }
    
    //definir um valor para o saldo privado
    public double setsaldo(double valor){
        return this.saldo = this.saldo + valor;
    }
    //sacar
    public void sacar (double valor) {
        this.saldo = this.saldo - valor;
    }
    //depositar
    public void depositar (double valor) {
        this.saldo = this.saldo + valor;
    }
    
    //transfere: destino: conta, valor: double
    public void transferir (Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }    
    
    
    //***********interface tributável
    public interface Tributavel {
        private double ValorImposto;
        void getValorImposto(){
            return this.saldo = (this.saldo * 1)/100;
        }
    }
    //**********interface tributável
    
    
    public class Conta_corrente extends Conta implements Tributavel {
     //A conta corrente deve implementar a interface Tributavel que contém o método getValue Imposto() que corresponde a 1% do saldo.
        
    }
    
    public class Conta_poupanca extends Conta {
    
    }
}
