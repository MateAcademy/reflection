package controller;

import dao.BetDao;
import dao.BetDaoImpl;
import factory.BetDaoFactory;
import lib.Inject;
import model.Bet;

import java.util.Scanner;

//handler это обработчик
public class ConsoleHandler {

    @Inject
    private static BetDao betDao;

    static public void handle() {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            }
        } catch (Exception e) {
            System.out.println("Данные введены не корректно");
        }
    }

}
