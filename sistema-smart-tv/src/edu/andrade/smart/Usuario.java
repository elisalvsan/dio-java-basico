package edu.andrade.smart;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();


        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("--------------------------------------------");

        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Novo status -> Volume Atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Novo status -> Canal Atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo status -> Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(20);
        System.out.println("Novo status -> Canal Atual: " + smartTv.canal);
    }
}
