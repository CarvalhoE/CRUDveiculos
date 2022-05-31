/*
*   O projeto interdisciplinar deste semestre tem como objetivo promover a integração das disciplinas 
*   de Técnicas de Desenvolvimento de Algoritmos e Programação Orientada a Objetos e consiste na 
*   construção de um sistema em Java que permita cadastro de itens, edições, consultas e remoções 
*   de dados.
*   
                    Tema do projeto: Sistema CRUD concessionaria
*       Sistema CRUD de veículos voltado para a área de concessionaria.
 */
package pacotePI;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *  Responsavel pelo desenvolvimento
 * 
 * @author Breno Espindola Carvalho dos Santos     :   RGM: 26062747
 */
public class Caminhao extends Veiculo{
       /**
        *Conversão do valor float para decimal para facil entrada de valor e formatação na saida.
     */
    static String padrao = "###,###.##";
    static DecimalFormat df = new DecimalFormat(padrao);
 
    public Caminhao(){
    }
    
    
    //Cadastro dos atributos
    public void cadastraVCaminhao(){        
        String marca = JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Qual a marca do veiculo ?");
        String modelo = JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Qual o modelo do veiculo ?");
        String cor = JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Qual a cor do veiculo ?");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Qual o ano do veiculo ?"));
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Insira o valor de venda do veiculo"));
        int finalPlaca = Integer.parseInt(JOptionPane.showInputDialog("Sistema CRUD Concessionaria\n\n" + "Insira o digito final da placa do veiculo"));
        
        setMarca(marca);
        setModelo(modelo);
        setCor(cor);
        setAno(ano);
        setPreco(preco);
        setFinalPlaca(finalPlaca);
    }
    
    //Utilização do toString para exibição final.
    @Override
    public String toString(){
        
        return "\n"+"Marca: "+ getMarca() + "\n" 
                +"Modelo: " +getModelo()+"\n"
                +"Ano: "+getAno()+"\n"
                +"Cor: "+getCor()+"\n"
                +"Preço: R$ "+ df.format(getPreco())+"\n"
                +"Digito final da placa: "+getFinalPlaca() + "\n\n";
    }
}
