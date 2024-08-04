package org.example;

public abstract  class Veiculo {
    private String modelo;
    private String marca;
    private String cor;
    private int anoFabricação;

    public Veiculo(String modelo, String marca, String cor, int anoFabricação) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.anoFabricação = anoFabricação;
    }

    public abstract void start();
    public abstract void stop();

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public void setAnoFabricação(int anoFabricação) {
        this.anoFabricação = anoFabricação;
    }


}


