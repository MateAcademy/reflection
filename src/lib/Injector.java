package lib;

import controller.ConsoleHandler;
import dao.BetDaoImpl;
import factory.BetDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoClass = BetDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if(field.getDeclaredAnnotation(Inject.class) != null) {
                try {
                    field.setAccessible(true);
                    field.set(null, BetDaoFactory.getBetDao());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
