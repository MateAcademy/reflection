import controller.ConsoleHandler;
import dao.BetDao;
import dao.BetDaoImpl;
import lib.Injector;

public class Main {

    static {
        Injector.injectDependency();
    }


    public static void main(String[] args) {
        System.out.println("Если хотите сделть ставку, введите \n " +
                "сумму и риск через пробел");
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();
        System.out.println(betDao.getAll());
    }
}
