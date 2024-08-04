package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Moto moto1 = new Moto("cb600","honda","preta",2018,300);
            Carro carro1 = new Carro("honda civic","honda","prata",2008,4,200);

        System.out.println("Moto:");
        System.out.println("Modelo: " + moto1.getModelo());
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Cor: " + moto1.getCor());
        System.out.println("Ano: " + moto1.getAnoFabricação());
        System.out.println("Quantidade de cilindradas: " + moto1.quantidadeCilindradas);
        moto1.start();
        moto1.start();
        moto1.stop();

        System.out.println("\nCarro:");
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Ano: " + carro1.getAnoFabricação());
        System.out.println(carro1);
        carro1.start();
        carro1.stop();
    }
}