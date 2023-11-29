/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features;

import java.util.HashSet;
import java.util.Set;
import tarefa.Tarefa;

/**
 *
 * @author alenc
 */
public class TarefaSet implements IDebeo {
    
    private Set<Tarefa> set;
    
    public TarefaSet() {
        this.set = new HashSet<>();
    }
    
    @Override
    public Boolean criar(Tarefa tarefa){
        return this.set.add(tarefa);
    }
    
    @Override
    public void excluir(String titulo){
        Tarefa tarefaEncontrada = null;
        for(Tarefa tarefa : this.set){
            if(tarefa.getTitulo().equals(titulo)){
                tarefaEncontrada = tarefa;
                break;
            }
        }
        
        if(tarefaEncontrada != null){
            this.set.remove(tarefaEncontrada);
        }
    }
    
    @Override
    public void alterar(Tarefa tarefa) {
        if (this.set.contains(tarefa)) {
            this.set.remove(tarefa); // Remover a tarefa antes de adicionar a versão alterada
            this.set.add(tarefa);    // Adicionar a versão alterada
        }
    }
    
    @Override
    public int contarTarefas(){
        return set.size();
    }

}
