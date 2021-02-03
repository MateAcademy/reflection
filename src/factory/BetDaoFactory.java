package factory;

import dao.BetDao;
import dao.BetDaoImpl;
import model.Bet;

public class BetDaoFactory {

     private static BetDao instance;

   static public BetDao getBetDao() {
       if (instance == null) {
           instance = new BetDaoImpl();
       }
        return instance;
    }
}
