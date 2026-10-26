package service;

public class DespesaFixa extends Despesas {

    @Override
    protected String titulo() {    
        return "Adicionar despesas fixas";
    }

    @Override
    protected String tituloExibirDespesas() {
        return "================ DESPESAS FIXAS ================";
    }  
}
