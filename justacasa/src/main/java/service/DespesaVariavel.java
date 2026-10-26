package service;

public class DespesaVariavel extends Despesas {

    @Override
    protected String titulo() {  
        return "Adicionar despesas variváveis";
    }

    @Override
    protected String tituloExibirDespesas() {
        return "================ DESPESAS VARIÁVEIS ================";
    }  
}
