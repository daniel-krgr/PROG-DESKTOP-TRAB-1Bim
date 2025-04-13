/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.unipar.osmecanica;

/**
 *
 * @author Daniel
 */
public interface iListener {
    
    void adicionarProduto(int quantidade, String nome, double valor);
    void adicionarServico(int quantidade, String nome, String descricao, double valor);

}
