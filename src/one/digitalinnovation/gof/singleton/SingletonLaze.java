package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Preguiçoso"
 * @author Maria
 */
public class SingletonLaze {
    private static SingletonLaze instancia ;

    /**
     *  o construtor do singleton tem que ser private, e é isso que vai garanir
     *  que ninguem externo consiga instanciar o projeto
      */

   private SingletonLaze() {
       super();
    }
    public static SingletonLaze getInstancia(){
       if(instancia == null){
           instancia = new SingletonLaze();
       }
       return instancia;
    }
}





























