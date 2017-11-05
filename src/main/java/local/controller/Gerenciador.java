package local.controller;

import java.util.List;

public interface Gerenciador {

    void cadastrar(Object obj);
    
    void alterar(Object obj);
    
    void remover(Object obj);
    
    List<Object> select(Object obj);
    
}
