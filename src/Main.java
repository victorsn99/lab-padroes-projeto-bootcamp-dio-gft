import com.lab.padroesprojeto.facade.Facade;
import com.lab.padroesprojeto.singleton.SingletonEager;
import com.lab.padroesprojeto.singleton.SingletonLazy;
import com.lab.padroesprojeto.singleton.SingletonLazyHolder;
import com.lab.padroesprojeto.strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton
        System.out.println("\nSingleton");
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy.toString());
        SingletonLazy singletonLazy2 = SingletonLazy.getInstance();
        System.out.println(singletonLazy.toString().equals(singletonLazy2.toString()) ? "Mesma instância." : "Instância Diferente.");

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager.toString());
        SingletonEager singletonEager2 = SingletonEager.getInstance();
        System.out.println(singletonEager.toString().equals(singletonEager2.toString()) ? "Mesma instância." : "Instância Diferente.");

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder.toString());
        SingletonLazyHolder singletonLazyHolder2 = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder.toString().equals(singletonLazyHolder2.toString()) ? "Mesma instância." : "Instância Diferente.");

        //Strategy
        System.out.println("\nStrategy");
        Comportamento comportamentoNormal = new ComportamentoNormal();
        Comportamento comportamentoDefensivo = new ComportamentoDefensivo();
        Comportamento comportamentoAgressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(comportamentoNormal);
        robo.mover();
        robo.mover();

        robo.setComportamento(comportamentoAgressivo);
        robo.mover();

        robo.setComportamento(comportamentoDefensivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        System.out.println("\nFacade");
        Facade facade = new Facade();
        facade.migrarCliente("Anderson", "00000-000");
    }
}