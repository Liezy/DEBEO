/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package features;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import tarefa.Tarefa;
import javax.swing.JOptionPane;
/**
 *
 * @author alenc
 */
public class TarefaMap implements IDebeo {
    
    private Map<String, Tarefa> map;
    
    public TarefaMap(){
        map = new TreeMap<>();
    }
    
    @Override
    public Boolean criar(Tarefa tarefa){
        if (map.containsKey(tarefa.getTitulo())) {
            return false;
        }
        
        map.put(tarefa.getTitulo(), tarefa);
        return true;
    }
    
    @Override
    public void excluir(String titulo) {
        if (titulo != null) {
            Tarefa tarefaCadastrada = map.get(titulo);

            if (tarefaCadastrada != null) {
                map.remove(tarefaCadastrada.getTitulo(), tarefaCadastrada);
            }
        }
    }
    
    @Override
    public void alterar(Tarefa tarefa){
        Tarefa tarefaCadastrada = map.get(tarefa.getTitulo());
        tarefaCadastrada.setTitulo(tarefa.getTitulo());
        tarefaCadastrada.setDescricao(tarefa.getDescricao());
    }

}
