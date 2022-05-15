public class Banco {
    Conta[] minhasContas = new Conta[10];
    minhasContas[0] = new Conta_corrente();
    
    
    
    
    //métodos
    
    void armazenaConta(String titular, int agencia, double saldo){}
    
    void removeConta(String titular){}
    
    int buscarConta(String titular){
        return 1; //informar o índice do array
    };
    
    void imprimeContas(){} //a lista deve ser mostrada em ordem alfabetica do titular.
    
    void imprimeConta(int i){} //imprime os dados da conta que está na posição "i" da lista de contas.
    
    
    
}
