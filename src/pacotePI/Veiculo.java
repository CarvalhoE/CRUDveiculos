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

/**
 *  Responsavel pelo desenvolvimento
 * 
 * @author Breno Espindola Carvalho dos Santos     :   RGM: 26062747
 */
public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private float preco;
    private int finalPlaca;
    
    public abstract String toString();
    
    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the finalPlaca
     */
    public int getFinalPlaca() {
        return finalPlaca;
    }

    /**
     * @param finalPlaca the finalPlaca to set
     */
    public void setFinalPlaca(int finalPlaca) {
        this.finalPlaca = finalPlaca;
    }   
}