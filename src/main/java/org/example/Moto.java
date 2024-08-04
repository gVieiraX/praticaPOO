package org.example;

public class Moto  extends Veiculo{
    int quantidadeCilindradas;

    public Moto(String modelo, String marca, String cor, int anoFabricação, int quantidadeCilindradas) {
        super(modelo, marca, cor, anoFabricação);
        this.quantidadeCilindradas = quantidadeCilindradas;
    }
    @Override
    public void start() {
        System.out.println("A moto está em movimento.");
    }

    @Override
    public void stop() {
        System.out.println("A moto parou.");
    }

    @Override
    public String toString() {
        return  "Quantidade De Cilindradas: " + quantidadeCilindradas;
    }
}
