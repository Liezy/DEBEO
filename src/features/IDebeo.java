/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package features;
import tarefa.Tarefa;
/**
 *
 * @author alenc
 */
public interface IDebeo {
    public Boolean criar(Tarefa tarefa);
    
    public void excluir(String titulo);
}
