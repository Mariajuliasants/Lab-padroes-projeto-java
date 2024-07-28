package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLaze;
import one.digitalinnovation.gof.singleton.SingletonLazeHolder;
import one.digitalinnovation.gof.strategy.ComportamentoAgresivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Teste {
    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton

        SingletonLaze lazy = SingletonLaze.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLaze.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazeHolder holder =  SingletonLazeHolder.getInstancia();
        System.out.println(holder);
        holder =  SingletonLazeHolder.getInstancia();
        System.out.println(holder);

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoAgresivo agressivo = new ComportamentoAgresivo();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        // Facade
        Facade facade= new Facade();
        facade.migrarCliente("Venilton","14545454");


    }
}





























