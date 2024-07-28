package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado" ja instancia direto e quando
 * precisar ja esta pronto diferente do lazer que primeiro
 * verifica  se esta nulo e depois instancia
 */
public class SingletonEager {
    private static SingletonEager  instancia = new SingletonEager();

    /**
     *  o construtor do singleton tem que ser private, e é isso que vai garanir
     *  que ninguem externo consiga instanciar o projeto
     */

    private SingletonEager () {
        super();
    }
    public static SingletonEager  getInstancia(){
        return instancia;
    }
}




















