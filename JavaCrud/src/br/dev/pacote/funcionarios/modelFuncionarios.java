/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.dev.pacote.funcionarios;

import br.dev.pacote.funcionario.entides.Funcionario;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jaque
 */
public class modelFuncionarios extends AbstractTableModel {
    
    
    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    String[] colunas = {"Nome", "Cpf", "Salario", "Area"};
    
    public void cadastrarFuncionario(Funcionario f){
        funcionarios.add(f);
        
        this.fireTableDataChanged();
    }

    
    public Funcionario returnFuncionario(int index){
        return funcionarios.get(index);
    }
    
    
    public void alterarFuncionario(int index, Funcionario f){
        funcionarios.set(index, f);
        this.fireTableDataChanged();
        
    }
    
    public void removerFuncionario(int index){
        funcionarios.remove(index);
        this.fireTableDataChanged();
        
    }
    
    
    
    
    
    
    // metodo para pega linha coluna e valores 
    @Override
    public int getRowCount() {
        return funcionarios.size();
       
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
        
    @Override
    public String getColumnName(int column){    
       return colunas[column];    
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        if(columnIndex == 0){
            return funcionarios.get(rowIndex).getNome();
        } else if(columnIndex == 1){
            return funcionarios.get(rowIndex).getCpf();
        }else if(columnIndex == 2) {
            return funcionarios.get(rowIndex).getSalario();
        }else {
            return funcionarios.get(rowIndex).getArea();
            
        }
        
        
    }
    
}
