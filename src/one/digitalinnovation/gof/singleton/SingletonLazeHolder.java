package one.digitalinnovation.gof.singleton;

/**
 * Singleton encapsula a instancia em uma classe estatica interna
 * que ele vai chamar de Holder
 *
 */
public class SingletonLazeHolder {
    // iner class
    private static class InstanceHolder {
        public static SingletonLazeHolder instancia = new SingletonLazeHolder();

}
    /**
     *  o construtor do singleton tem que ser private, e é isso que vai garanir
     *  que ninguem externo consiga instanciar o projeto
     */

    private SingletonLazeHolder() {
        super();
    }

    public static SingletonLazeHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}




















