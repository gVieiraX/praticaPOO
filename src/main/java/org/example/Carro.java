package org.example;

public class Carro extends  Veiculo{
    int quantidadeDePortas;
    int quantidadeDeCavalosMotor;

    public Carro(String modelo, String marca, String cor, int anoFabricação, int quantidadeDePortas, int quantidadeDeCavalosMotor) {
        super(modelo, marca, cor, anoFabricação);
        this.quantidadeDePortas = quantidadeDePortas;
        this.quantidadeDeCavalosMotor = quantidadeDeCavalosMotor;
    }
    @Override
    public void start() {
        System.out.println("O carro está em movimento");
    }

    @Override
    public void stop() {
        System.out.println("O carro está em movimento");
    }

    @Override
    public String toString() {
        return  "Quantidade De Portas: " + quantidadeDePortas +
                "\nQuantidade De Cavalos: " + quantidadeDeCavalosMotor;
    }
}
